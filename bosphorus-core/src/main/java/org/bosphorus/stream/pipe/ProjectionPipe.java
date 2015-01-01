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

package org.bosphorus.stream.pipe;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.stream.IWriter;

public class ProjectionPipe<TInput, TOutput> implements IWriter<TInput> {

	private IScalarExecutor<? super TInput, ? extends TOutput> expression;
	private IWriter<? super TOutput> outputStream;
	
	public ProjectionPipe(IScalarExecutor<? super TInput, ? extends TOutput> expression, 
			IWriter<? super TOutput> outputStream) {
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
