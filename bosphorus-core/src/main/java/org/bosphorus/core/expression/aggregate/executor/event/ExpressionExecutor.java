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

package org.bosphorus.core.expression.aggregate.executor.event;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;

public class ExpressionExecutor<TInput, TType, TOutput> implements IAggregateExecutor<TInput, TOutput> {
	private IScalarExecutor1<? super TInput, ? extends TType> expression;
	private IAggregateExecutor<? super TType, ? extends TOutput> executor;
	
	public ExpressionExecutor(IScalarExecutor1<? super TInput, ? extends TType> expression, 
			IAggregateExecutor<? super TType, ? extends TOutput> executor) {
		this.expression = expression;
		this.executor = executor;
	}

	@Override
	public void execute(TInput input) throws Exception {
		TType obj = expression.execute(input);
		if(obj != null) {
			executor.execute(obj);
		}
	}

	@Override
	public TOutput getValue() {
		return executor.getValue();
	}

	@Override
	public void reset() {
		expression.reset();
		executor.reset();
	}

	@Override
	public Object getState() {
		return new Object[] {
				this.expression.getState(),
				this.executor.getState()
		};
	}

	@Override
	public void setState(Object state) throws Exception {
		Object[] arr = (Object[])state;
		this.expression.setState(arr[0]);
		this.executor.setState(arr[1]);
	}

}
