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
import java.util.LinkedList;
import java.util.List;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;

public class LastNExecutor<TType> implements IAggregateExecutor<TType, List<TType>> {
	private LinkedList<TType> list;
	private Integer maxSize;
	
	public LastNExecutor(Integer maxSize) {
		this.maxSize = maxSize;
		this.list = new LinkedList<TType>();
	}

	@Override
	public void execute(TType input) throws Exception {
		list.add(input);
		while(list.size() > maxSize) {
			list.poll();
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
		this.list = (LinkedList<TType>)state;
	}

}
