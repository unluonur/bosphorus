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


package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.core.expression.scalar.factory.common.PartitionExecutorFactory;

public class PartitionExpression<TInput, TOutput, TPartitionKey> implements IScalarExpression1<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression1<? super TInput, ? extends TPartitionKey> keyExpression;
	private IScalarExpression1<? super TInput, ? extends TOutput> executorExpression;
	
	public PartitionExpression(IScalarExpression1<? super TInput, ? extends TPartitionKey> keyExpression, IScalarExpression1<? super TInput, ? extends TOutput> executorExpression) {
		this.setKeyExpression(keyExpression);
		this.setExecutorExpression(executorExpression);
	}

	public IScalarExpression1<? super TInput, ? extends TPartitionKey> getKeyExpression() {
		return keyExpression;
	}

	public void setKeyExpression(IScalarExpression1<? super TInput, ? extends TPartitionKey> keyExpression) {
		this.keyExpression = keyExpression;
	}

	public IScalarExpression1<? super TInput, ? extends TOutput> getExecutorExpression() {
		return executorExpression;
	}

	public void setExecutorExpression(IScalarExpression1<? super TInput, ? extends TOutput> executorExpression) {
		this.executorExpression = executorExpression;
	}
	
	@Override
	public IScalarExecutorFactory1<TInput, TOutput> build() {
		return new PartitionExecutorFactory<TInput, TOutput, TPartitionKey>(this.getKeyExpression().build(), this.getExecutorExpression().build());
	}

}
