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

package org.bosphorus.expression.scalar.executor.string;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class SubStringExecutor<TInput> implements IScalarExecutor<TInput, String> {
	
	private IScalarExecutor<? super TInput, String> value;
	private IScalarExecutor<? super TInput, Integer> startIndex;
	private IScalarExecutor<? super TInput, Integer> length;
	
	public SubStringExecutor(IScalarExecutor<? super TInput, String> value, 
			IScalarExecutor<? super TInput, Integer> startIndex, 
			IScalarExecutor<? super TInput, Integer> length) {
		this.value = value;
		this.startIndex = startIndex;
		this.length = length;
	}

	@Override
	public String execute(TInput input) throws Exception {
		String value = this.value.execute(input);
		Integer startIndex = this.startIndex.execute(input);
		Integer endIndex = startIndex + length.execute(input);
		return value.substring(startIndex, endIndex);
	}

}
