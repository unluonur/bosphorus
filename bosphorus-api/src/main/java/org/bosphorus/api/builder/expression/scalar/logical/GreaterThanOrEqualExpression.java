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


package org.bosphorus.api.builder.expression.scalar.logical;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.logical.GreaterThanOrEqualExecutor;

public class GreaterThanOrEqualExpression<TInput, TType extends Comparable<TType>> extends BaseComparisonExpression<TInput, TType> {

	private static final long serialVersionUID = 1L;

	public GreaterThanOrEqualExpression(IScalarExpression<TInput, TType> left,
			IScalarExpression<TInput, TType> right) {
		super(left, right);
	}

	@Override
	public IScalarExecutor<TInput, Boolean> build() {
		return new GreaterThanOrEqualExecutor<TInput, TType>(getLeft().build(), getRight().build());
	}

}
