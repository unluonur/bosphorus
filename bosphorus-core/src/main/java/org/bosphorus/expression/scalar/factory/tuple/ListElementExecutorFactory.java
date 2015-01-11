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


package org.bosphorus.expression.scalar.factory.tuple;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.expression.scalar.executor.tuple.ListElementExecutor;
import org.bosphorus.expression.scalar.factory.IScalarExecutorFactory1;

public class ListElementExecutorFactory<TInput extends List<?>, TType> implements IScalarExecutorFactory1<TInput, TType> {
	
	private Integer fieldIndex;
	
	public ListElementExecutorFactory(Integer fieldIndex) {
		this.fieldIndex = fieldIndex;
	}

	@Override
	public IScalarExecutor1<TInput, TType> create() {
		return new ListElementExecutor<TInput, TType>(fieldIndex);
	}
}
