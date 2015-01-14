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

package org.bosphorus.core.stream.batch;

import java.util.List;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.core.stream.IPipeExecutor;
import org.bosphorus.core.stream.IReader;

public class BatchReader<TInput, TOutput> implements IPipeExecutor<TInput>, IReader<TOutput> {
	protected Object lockObject;
	private IAggregateExecutor<? super TInput, ? extends TOutput> executor;
	
	public BatchReader(IAggregateExecutor<? super TInput, ? extends TOutput> executor) {
		this.lockObject = new Object();
		this.executor = executor;
	}
	
	@Override
	public void writeOne(TInput input) throws Exception {
		synchronized (lockObject) {
			executor.execute(input);
		}
	}

	@Override
	public void writeMulti(List<? extends TInput> input) throws Exception {
		synchronized (this.lockObject) {
			for(TInput item: input) {
				executor.execute(item);
			}
		}
	}

	@Override
	public TOutput read() throws Exception {
		synchronized (lockObject) {
			TOutput result = executor.getValue();
			// TODO : state will be saved
			//Object state = executor.getState();
			executor.reset();
			return result;
		}
	}

}
