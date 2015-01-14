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


package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.core.stream.IPipeExecutor;
import org.bosphorus.core.stream.batch.TimeIntervalBatch;

public class TimeIntervalAggregateStream<TInput, TOutput> extends BaseSingleOutputStream<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IAggregateExpression<TInput, TOutput> expression;
	private int interval;

	public TimeIntervalAggregateStream(IAggregateExpression<TInput, TOutput> expression, int interval) {
		this.expression = expression;
		this.interval = interval;
	}

	@Override
	public IPipeExecutor<TInput> build() throws Exception {
		return new TimeIntervalBatch<TInput, TOutput>(this.expression.build().create(), this.getOutput().build(), interval);
	}
	
}
