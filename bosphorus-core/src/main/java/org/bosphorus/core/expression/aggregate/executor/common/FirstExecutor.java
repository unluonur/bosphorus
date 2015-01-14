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

import java.io.Serializable;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;

public class FirstExecutor<TType> implements IAggregateExecutor<TType, TType> {
	private State<TType> state;
	
	public FirstExecutor() {
		this.state = new State<TType>();
		this.reset();
	}

	@Override
	public void execute(TType input) throws Exception {
		if(!state.hasValue) {
			state.value = input;
			state.hasValue = true;
		}
	}

	@Override
	public TType getValue() {
		return state.value;
	}

	@Override
	public void reset() {
		state.hasValue = false;
		state.value = null;
	}

	@Override
	public Object getState() {
		return state;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		this.state = (State<TType>)state;
	}
	
	private static class State<TType> implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private Boolean hasValue;
		private TType value;
	}

}
