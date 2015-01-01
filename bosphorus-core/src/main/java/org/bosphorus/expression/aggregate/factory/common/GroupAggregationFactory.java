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

package org.bosphorus.expression.aggregate.factory.common;

import java.util.Map;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.common.GroupAggregationExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

/**
 * @author Onur �nl�
 *
 */
public class GroupAggregationFactory<TInput, TKey, TValue> implements IAggregateExecutorFactory<TInput, Map<TKey, TValue>> {
	private IScalarExecutor<? super TInput, ? extends TKey> keyExpression;
	private IAggregateExecutorFactory<? super TInput, ? extends TValue> valueFactory;
	
	public GroupAggregationFactory(IScalarExecutor<? super TInput, ? extends TKey> keyExpression, IAggregateExecutorFactory<? super TInput, ? extends TValue> valueFactory) {
		this.keyExpression = keyExpression;
		this.valueFactory = valueFactory;
	}

	@Override
	public IAggregateExecutor<TInput, Map<TKey, TValue>> create() {
		return new GroupAggregationExecutor<TInput, TKey, TValue>(keyExpression, valueFactory);
	}

}
