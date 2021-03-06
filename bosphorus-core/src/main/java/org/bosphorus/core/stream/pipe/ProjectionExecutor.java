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

package org.bosphorus.core.stream.pipe;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.core.stream.IPipeExecutor;

public class ProjectionExecutor<TInput, TOutput> implements IPipeExecutor<TInput> {

	private IScalarExecutor1<? super TInput, ? extends TOutput> expression;
	private IPipeExecutor<? super TOutput> outputStream;
	
	public ProjectionExecutor(IScalarExecutor1<? super TInput, ? extends TOutput> expression, 
			IPipeExecutor<? super TOutput> outputStream) {
		this.expression = expression;
		this.outputStream = outputStream;
	}

	@Override
	public void writeOne(TInput input) throws Exception {
		outputStream.writeOne(expression.execute(input));
	}

	@Override
	public void writeMulti(List<? extends TInput> input) throws Exception {
		ArrayList<TOutput> result = new ArrayList<TOutput>();
		for(TInput item: input) {
			result.add(expression.execute(item));
		}
		outputStream.writeMulti(result);
	}

}
