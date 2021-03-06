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

package org.bosphorus.core.stream.batch;

import java.util.List;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.core.stream.IPipeExecutor;

public class MaxSizeBatch<TInput, TOutput> implements IPipeExecutor<TInput> {

	protected Object lockObject;
	private IAggregateExecutor<? super TInput, ? extends TOutput> executor;
	private IPipeExecutor<? super TOutput> output;
	private Integer maxSize;
	private Integer count;
	
	public MaxSizeBatch(IAggregateExecutor<? super TInput, ? extends TOutput> executor,
			IPipeExecutor<? super TOutput> output,
			Integer maxSize) {
		this.lockObject = new Object();
		this.executor = executor;
		this.output = output;
		this.maxSize = maxSize;
		this.count = 0;
	}
	
	@Override
	public void writeOne(TInput input) throws Exception {
		synchronized (this.lockObject) {
			executor.execute(input);
			count++;
			clear();
		}
	}

	@Override
	public void writeMulti(List<? extends TInput> input) throws Exception {
		synchronized (this.lockObject) {
			for(TInput item: input) {
				executor.execute(item);
			}
			count += input.size();
			clear();
		}
	}
	
	private void clear() throws Exception {
		if(count >= maxSize) {
			output.writeOne(executor.getValue());
			executor.reset();
			count = 0;
		}
	}
}
