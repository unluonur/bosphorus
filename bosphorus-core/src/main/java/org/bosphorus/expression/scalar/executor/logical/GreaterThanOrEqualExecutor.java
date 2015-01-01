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

package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class GreaterThanOrEqualExecutor<TInput, TType extends Comparable<TType>> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<? super TInput, ? extends TType> left;
	private IScalarExecutor<? super TInput, ? extends TType> right;

	public GreaterThanOrEqualExecutor(IScalarExecutor<? super TInput, ? extends TType> left, 
			IScalarExecutor<? super TInput, ? extends TType> right) {
		this.left = left;
		this.right = right;
	}
	
	public Boolean execute(TInput input) throws Exception {
		TType left = this.left.execute(input);
		TType right = this.right.execute(input);
		if(left == null) {
			return right == null;
		}
		return left.compareTo(right) >= 0;
	}

}
