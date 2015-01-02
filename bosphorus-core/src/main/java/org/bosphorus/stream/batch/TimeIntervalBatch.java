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

package org.bosphorus.stream.batch;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.stream.IPipeExecutor;

public class TimeIntervalBatch<TInput, TOutput> implements IPipeExecutor<TInput> {

	protected Object lockObject;
	private IAggregateExecutor<? super TInput, ? extends TOutput> executor;
	private Timer timer;

	public TimeIntervalBatch(final IAggregateExecutor<? super TInput, ? extends TOutput> executor,
			final IPipeExecutor<? super TOutput> output,
			Integer interval) {
		this.lockObject = new Object();
		this.executor = executor;
		
		timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					synchronized (lockObject) {
						output.writeOne(executor.getValue());
						executor.reset();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, interval);
	}
	
	@Override
	public void writeOne(TInput input) throws Exception {
		synchronized (this.lockObject) {
			executor.execute(input);
		}
	}

	@Override
	public void writeMulti(List<? extends TInput> input) throws Exception {
		synchronized (this.lockObject) {
			for(TInput item: input) {
				executor.execute(item);
			}
		}
	}

}
