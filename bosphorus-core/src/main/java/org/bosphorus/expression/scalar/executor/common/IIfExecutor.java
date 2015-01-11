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

package org.bosphorus.expression.scalar.executor.common;

import org.bosphorus.expression.scalar.executor.IScalarExecutor1;

public class IIfExecutor<TInput, TOutput> implements IScalarExecutor1<TInput, TOutput> {
	
	private IScalarExecutor1<? super TInput, Boolean> condition;
	private IScalarExecutor1<? super TInput, ? extends TOutput> trueValue;
	private IScalarExecutor1<? super TInput, ? extends TOutput> falseValue;
	
	public IIfExecutor(IScalarExecutor1<? super TInput, Boolean> condition, 
			IScalarExecutor1<? super TInput, ? extends TOutput> trueValue, 
			IScalarExecutor1<? super TInput, ? extends TOutput> falseValue) {
		this.condition = condition;
		this.trueValue = trueValue;
		this.falseValue = falseValue;
	}

	@Override
	public TOutput execute(TInput input) throws Exception {
		return condition.execute(input) ? trueValue.execute(input) : falseValue.execute(input);
	}

}
