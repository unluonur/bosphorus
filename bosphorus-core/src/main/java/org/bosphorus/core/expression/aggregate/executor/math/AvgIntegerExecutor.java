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

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;

public class AvgIntegerExecutor implements IAggregateExecutor<Number, Integer> {
	private AvgState<Long, Long> state;

	public AvgIntegerExecutor() {
		this.state = new AvgState<Long, Long>();
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		if(input != null) {
			state.sum += input.longValue();
			state.count++;
		}
	}

	@Override
	public Integer getValue() {
		if(state.count != 0) {
			Long l = state.sum / state.count;
			return l.intValue();	
		}
		return null;
	}

	@Override
	public void reset() {
		state.sum = 0L;
		state.count = 0L;
	}

	@Override
	public Object getState() {
		return state;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		this.state = (AvgState<Long, Long>)state;
	}

}
