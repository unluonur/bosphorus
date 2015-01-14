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

import org.bosphorus.core.expression.scalar.executor.IScalarExecutor0;
import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;

public class ExpressionExecutor0<TInput, TOutput> implements IScalarExecutor1<TInput, TOutput> {
	private IScalarExecutor0<? extends TOutput> executor;

	public ExpressionExecutor0(IScalarExecutor0<? extends TOutput> executor) {
		this.executor = executor;
	}

	@Override
	public TOutput execute(TInput input) throws Exception {
		return executor.execute();
	}

	@Override
	public void reset() {
		executor.reset();
	}

	@Override
	public Object getState() {
		return executor.getState();
	}

	@Override
	public void setState(Object state) throws Exception {
		executor.setState(state);
	}
}
