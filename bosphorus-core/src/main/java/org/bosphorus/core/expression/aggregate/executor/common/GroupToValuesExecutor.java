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


package org.bosphorus.core.expression.aggregate.executor.common;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;

public class GroupToValuesExecutor<TInput, TKey, TValue> extends BaseGroupExecutor<TInput, List<TValue>, TKey, TValue> {

	public GroupToValuesExecutor(
			IScalarExecutor1<? super TInput, ? extends TKey> keyExpression,
			IAggregateExecutorFactory<? super TInput, ? extends TValue> valueExpression) {
		super(keyExpression, valueExpression);
	}

	@Override
	public List<TValue> getValue() {
		ArrayList<TValue> result = new ArrayList<TValue>();
		for(IAggregateExecutor<? super TInput, ? extends TValue> value: map.values()) {
			result.add(value.getValue());
		}
		return result;
	}
}
