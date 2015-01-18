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


package org.bosphorus.core.expression.aggregate.executor.math;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;

public class MedianLongExecutor implements IAggregateExecutor<Number, Long> {
	private List<Number> list;
	
	public MedianLongExecutor() {
		list = new ArrayList<Number>();
	}

	@Override
	public void execute(Number input) throws Exception {
		list.add(input);
	}

	@Override
	public Long getValue() {
		Integer size = list.size();
		if(size == 0) {
			return null;
		}
		if(size % 2 == 1) {
			return list.get(size / 2).longValue();
		}
		else {
			return (list.get(size / 2 - 1).longValue() + list.get(size / 2).longValue()) / 2;
		}
	}

	@Override
	public void reset() {
		list.clear();
	}

	@Override
	public Object getState() {
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		list = (List<Number>)state;
	}

}
