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
import org.bosphorus.core.expression.aggregate.executor.common.SelectExecutor;
import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;

public class SelectFactory<TType> implements IAggregateExecutorFactory<TType, List<TType>> {

	@Override
	public IAggregateExecutor<TType, List<TType>> create() {
		return new SelectExecutor<TType>();
	}

}
