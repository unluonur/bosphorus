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

package org.bosphorus.expression.scalar.executor.string;

import java.util.ArrayList;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class StrConcatExecutor<TInput> implements IScalarExecutor<TInput, String> {
	
	private ArrayList<IScalarExecutor<? super TInput, String>> list;

	@SafeVarargs
	public StrConcatExecutor(IScalarExecutor<? super TInput, String>... list) {
		this.list = new ArrayList<IScalarExecutor<? super TInput, String>>();
		for(IScalarExecutor<? super TInput, String> expr: list) {
			this.list.add(expr);
		}
	}

	@Override
	public String execute(TInput input) throws Exception {
		String result = "";
		for(IScalarExecutor<? super TInput, String> expr: list) {
			result += expr.execute(input);
		}
		return result;
	}

}
