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


package org.bosphorus.core.expression.aggregate.factory.common;

import java.util.List;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.core.expression.aggregate.executor.common.GroupToValuesExecutor;
import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;

public class GroupToValuesFactory<TInput, TKey, TValue> implements IAggregateExecutorFactory<TInput, List<TValue>> {
	private IScalarExecutorFactory1<? super TInput, ? extends TKey> keyExpression;
	private IAggregateExecutorFactory<? super TInput, ? extends TValue> valueFactory;
	
	public GroupToValuesFactory(IScalarExecutorFactory1<? super TInput, ? extends TKey> keyExpression, IAggregateExecutorFactory<? super TInput, ? extends TValue> valueFactory) {
		this.keyExpression = keyExpression;
		this.valueFactory = valueFactory;
	}

	@Override
	public IAggregateExecutor<TInput, List<TValue>> create() {
		return new GroupToValuesExecutor<TInput, TKey, TValue>(keyExpression.create(), valueFactory);
	}

}
