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

package org.bosphorus.core.expression.aggregate.executor.common;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;


public class MaxExecutor<TType extends Comparable<TType>> implements IAggregateExecutor<TType, TType> {
	private TType value;
	
	public MaxExecutor() {
		this.reset();
	}

	@Override
	public void execute(TType input) throws Exception {
		if(value == null || value.compareTo(input) < 0) {
			value = input;
		}
	}

	@Override
	public TType getValue() {
		return value;
	}

	@Override
	public void reset() {
		value = null;
	}

	@Override
	public Object getState() {
		return value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		value = (TType)state;
	}

}
