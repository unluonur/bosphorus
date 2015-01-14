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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Topology implements ITopology {
	
	private HashMap<String, Stream<?>> streams;
	private Object lockObject;

	public Topology() {
		streams = new HashMap<String, Stream<?>>();
		lockObject = new Object();
	}

	@Override
	public List<String> streams() {
		synchronized (lockObject) {
			return new ArrayList<String>(this.streams.keySet());	
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <TType> Stream<TType> stream(String name) {
		synchronized (lockObject) {
			return (Stream<TType>)streams.get(name);	
		}
	}

	@Override
	public <TType> Stream<TType> createStream(String name) {
		synchronized (lockObject) {
			Stream<TType> result = new Stream<TType>();
			streams.put(name, result);
			return result;	
		}
	}

	@Override
	public void removeStream(String name) {
		synchronized (lockObject) {
			streams.remove(name);	
		}
	}

}
