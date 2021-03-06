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

package org.bosphorus.core.expression.aggregate.executor.math;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;

public class AvgDoubleExecutor implements IAggregateExecutor<Number, Double> {
	private AvgState<Double, Long> state;
	
	public AvgDoubleExecutor() {
		this.state = new AvgState<Double, Long>();
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		state.sum += input.doubleValue();
		state.count++;
	}

	@Override
	public Double getValue() {
		if(state.count != 0) {
			return state.sum / state.count;	
		}
		return null;
	}

	@Override
	public void reset() {
		state.sum = 0.0;
		state.count = 0L;
	}

	@Override
	public Object getState() {
		return state;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		this.state = (AvgState<Double, Long>)state;
	}
}
