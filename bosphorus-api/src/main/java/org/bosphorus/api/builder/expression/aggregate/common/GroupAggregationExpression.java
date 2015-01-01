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

package org.bosphorus.api.builder.expression.aggregate.common;

import java.util.Map;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.aggregate.factory.common.GroupAggregationFactory;

/**
 * @author Onur �nl�
 *
 */
public class GroupAggregationExpression<TInput, TKey, TValue> implements IAggregateExpression<TInput, Map<TKey, TValue>> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<? super TInput, ? extends TKey> keyExpression;
	private IAggregateExpression<? super TInput, ? extends TValue> valueExpression;

	public GroupAggregationExpression(
			IScalarExpression<? super TInput, ? extends TKey> keyExpression, 
			IAggregateExpression<? super TInput, ? extends TValue> valueExpression) {
		this.keyExpression = keyExpression;
		this.valueExpression = valueExpression;
	}
	
	@Override
	public IAggregateExecutorFactory<TInput, Map<TKey, TValue>> build() {
		return new GroupAggregationFactory<TInput, TKey, TValue>(this.keyExpression.build(), this.valueExpression.build());
	}

}
