/**
 * Copyright (c) Onur �nl�
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

package org.bosphorus.expression.aggregate.executor.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;


public class SumIntegerExecutor implements IAggregateExecutor<Number, Integer> {
	private Integer sum;
	
	public SumIntegerExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		if(input != null) {
			sum += input.intValue();
		}
	}

	@Override
	public Integer getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0;
	}

	@Override
	public Object getState() {
		return this.sum;
	}

	@Override
	public void setState(Object state) throws Exception {
		this.sum = (Integer)state;
	}

}
