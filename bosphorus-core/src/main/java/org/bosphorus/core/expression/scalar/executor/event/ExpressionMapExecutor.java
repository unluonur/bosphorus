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

package org.bosphorus.core.expression.scalar.executor.event;

import java.util.HashMap;
import java.util.Map;

import org.bosphorus.core.expression.scalar.executor.BaseStatelessExecutor1;
import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;

public class ExpressionMapExecutor<TInput, TOutput> extends BaseStatelessExecutor1<TInput, Map<String, TOutput>> {
	private Map<String, ? extends IScalarExecutor1<TInput, ? extends TOutput>> expressions;

	public ExpressionMapExecutor(Map<String, ? extends IScalarExecutor1<TInput, ? extends TOutput>> expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public Map<String, TOutput> execute(TInput input) throws Exception {
		HashMap<String, TOutput> result = new HashMap<String, TOutput>();
		for(String key: expressions.keySet()) {
			result.put(key, expressions.get(key).execute(input));
		}
		return result;
	}

}
