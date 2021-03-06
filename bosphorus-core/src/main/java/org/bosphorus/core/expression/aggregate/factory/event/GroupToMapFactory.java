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

package org.bosphorus.core.expression.aggregate.factory.event;

import java.util.Map;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.core.expression.aggregate.executor.event.GroupToMapExecutor;
import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;

/**
 * @author Onur �nl�
 *
 */
public class GroupToMapFactory<TInput, TKey, TValue> implements IAggregateExecutorFactory<TInput, Map<TKey, TValue>> {
	private IScalarExecutorFactory1<? super TInput, ? extends TKey> keyExpression;
	private IAggregateExecutorFactory<? super TInput, ? extends TValue> valueFactory;
	
	public GroupToMapFactory(IScalarExecutorFactory1<? super TInput, ? extends TKey> keyExpression, IAggregateExecutorFactory<? super TInput, ? extends TValue> valueFactory) {
		this.keyExpression = keyExpression;
		this.valueFactory = valueFactory;
	}

	@Override
	public IAggregateExecutor<TInput, Map<TKey, TValue>> create() {
		return new GroupToMapExecutor<TInput, TKey, TValue>(keyExpression.create(), valueFactory);
	}

}
