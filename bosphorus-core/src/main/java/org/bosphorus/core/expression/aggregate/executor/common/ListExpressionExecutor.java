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

import java.util.List;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;

public class ListExpressionExecutor<TInput, TType, TOutput> implements IAggregateExecutor<TInput, TOutput> {
	private IScalarExecutor1<? super TInput, ? extends List<? extends TType>> expression;
	private IAggregateExecutor<? super TType, ? extends TOutput> executor;
	
	public ListExpressionExecutor(IScalarExecutor1<? super TInput, ? extends List<? extends TType>> expression, 
			IAggregateExecutor<? super TType, ? extends TOutput> executor) {
		this.expression = expression;
		this.executor = executor;
	}

	@Override
	public void execute(TInput input) throws Exception {
		for(TType value: expression.execute(input)) {
			executor.execute(value);
		}
	}

	@Override
	public TOutput getValue() {
		return executor.getValue();
	}

	@Override
	public void reset() {
		executor.reset();
	}

	@Override
	public Object getState() {
		return this.executor.getState();
	}

	@Override
	public void setState(Object state) throws Exception {
		this.executor.setState(state);
	}

}
