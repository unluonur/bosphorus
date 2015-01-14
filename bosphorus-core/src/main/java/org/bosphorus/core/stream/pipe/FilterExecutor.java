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

public class FilterExecutor<TInput> implements IPipeExecutor<TInput> {
	
	private IScalarExecutor1<? super TInput, Boolean> expression;
	private IPipeExecutor<? super TInput> outputStream;
	
	public FilterExecutor(IScalarExecutor1<? super TInput, Boolean> expression, 
			IPipeExecutor<? super TInput> outputStream) {
		this.expression = expression;
		this.outputStream = outputStream;
	}

	@Override
	public void writeOne(TInput input) throws Exception {
		if(expression.execute(input)) {
			outputStream.writeOne(input);
		}
	}

	@Override
	public void writeMulti(List<? extends TInput> input) throws Exception {
		ArrayList<TInput> result = new ArrayList<TInput>();
		for(TInput item: input) {
			if(expression.execute(item)) {
				result.add(item);
			}
		}
		if(result.size()>0) {
			outputStream.writeMulti(result);
		}
	}
}
