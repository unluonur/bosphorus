/**
 * Copyright (c) Onur Ünlü
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The latest version of this file can be found at https://github.com/unluonur/bosphorus
 */


package org.bosphorus.core.topology;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bosphorus.core.stream.IPipeExecutor;

public class Stream<TInput> implements IPipeExecutor<TInput> {
	private HashMap<String, IPipeExecutor<? super TInput>> outputs;
	private Object lockObject;
	
	public Stream() {
		lockObject = new Object();
		outputs = new HashMap<String, IPipeExecutor<? super TInput>>();
	}

	@Override
	public void writeOne(TInput input) throws Exception {
		synchronized (lockObject) {
			for(IPipeExecutor<? super TInput> executor: outputs.values()) {
				executor.writeOne(input);
			}
		}
	}

	@Override
	public void writeMulti(List<? extends TInput> input) throws Exception {
		synchronized (lockObject) {
			for(IPipeExecutor<? super TInput> executor: outputs.values()) {
				executor.writeMulti(input);
			}
		}
	}
	
	public String subscribe(IPipeExecutor<? super TInput> output) {
		synchronized (lockObject) {
			String key = UUID.randomUUID().toString();
			outputs.put(key, output);
			return key;
		}
	}
	
	public void unsubscribe(String name) {
		synchronized (lockObject) {
			outputs.remove(name);
		}
	}
}
