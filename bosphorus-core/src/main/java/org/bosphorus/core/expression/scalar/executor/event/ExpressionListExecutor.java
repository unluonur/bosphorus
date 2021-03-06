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

package org.bosphorus.core.expression.scalar.executor.event;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;

public class ExpressionListExecutor<TInput, TType> implements IScalarExecutor1<TInput, List<TType>> {

	private List<? extends IScalarExecutor1<? super TInput, ? extends TType>> expressions;

	public ExpressionListExecutor(List<? extends IScalarExecutor1<? super TInput, ? extends TType>> expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public List<TType> execute(TInput input) throws Exception {
		ArrayList<TType> result = new ArrayList<TType>();
		for(IScalarExecutor1<? super TInput, ? extends TType> expr: expressions) {
			result.add(expr.execute(input));
		}
		return result;
	}

	@Override
	public void reset() {
		for(IScalarExecutor1<? super TInput, ? extends TType> executor: expressions) {
			executor.reset();
		}
	}

	@Override
	public Object getState() {
		ArrayList<Object> state = new ArrayList<Object>();
		for(IScalarExecutor1<? super TInput, ? extends TType> executor: expressions) {
			state.add(executor.getState());
		}
		return state;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		List<Object> list = (List<Object>)state;
		for(int i=0; i<list.size(); i++) {
			expressions.get(i).setState(list.get(i));
		}
	}

}
