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

package org.bosphorus.stream.batch.join;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.stream.IReader;

public abstract class BaseJoin<TInput> implements IReader<List<List<TInput>>> {
	private IReader<List<List<TInput>>> left;
	private IReader<List<TInput>> right;
	private IScalarExecutor<List<TInput>, Boolean> expression;
	
	public BaseJoin(IReader<List<List<TInput>>> left, IReader<List<TInput>> right, IScalarExecutor<List<TInput>, Boolean> expression) {
		this.setLeft(left);
		this.setRight(right);
		this.setExpression(expression);
	}
	
	public IReader<List<List<TInput>>> getLeft() {
		return left;
	}
	
	public void setLeft(IReader<List<List<TInput>>> left) {
		this.left = left;
	}
	
	public IReader<List<TInput>> getRight() {
		return right;
	}
	
	public void setRight(IReader<List<TInput>> right) {
		this.right = right;
	}

	public IScalarExecutor<List<TInput>, Boolean> getExpression() {
		return expression;
	}

	public void setExpression(IScalarExecutor<List<TInput>, Boolean> expression) {
		this.expression = expression;
	}
	
}
