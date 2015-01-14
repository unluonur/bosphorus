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

package org.bosphorus.core.expression.aggregate.executor.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;

public class TopNExecutor<TType> implements IAggregateExecutor<TType, List<TType>> {
	private List<TType> list;
	private Integer maxSize;
	private Comparator<TType> comparator;
	
	public TopNExecutor(Integer maxSize, Comparator<TType> comparator) {
		this.maxSize = maxSize;
		this.comparator = comparator;
		this.list = new ArrayList<TType>();
	}

	// TODO : Binary search may be implemented
	@Override
	public void execute(TType input) throws Exception {
		if(list.size() < maxSize || comparator.compare(input, list.get(list.size() - 1)) < 0) {
			Integer index = 0;
			for(; index<list.size()-1; index++) {
				if(comparator.compare(input, list.get(index)) < 0) {
					break;
				}
			}
			list.add(index, input);
			while(list.size()>maxSize) {
				list.remove(list.size() - 1);
			}
		}
	}

	@Override
	public List<TType> getValue() {
		return new ArrayList<TType>(list);
	}

	@Override
	public void reset() {
		list.clear();
	}

	@Override
	public Object getState() {
		return this.list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		this.list = (List<TType>)state;
	}

}
