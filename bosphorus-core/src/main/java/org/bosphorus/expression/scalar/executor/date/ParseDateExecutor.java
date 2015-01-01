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

package org.bosphorus.expression.scalar.executor.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ParseDateExecutor<TInput> implements IScalarExecutor<TInput, Date> {
	private IScalarExecutor<? super TInput, String> expression;
	private IScalarExecutor<? super TInput, String> formatExpression;
	
	public ParseDateExecutor(IScalarExecutor<? super TInput, String> expression, 
			IScalarExecutor<? super TInput, String> formatExpression) {
		this.expression = expression;
		this.formatExpression = formatExpression;
	}

	@Override
	public Date execute(TInput input) throws Exception {
		DateFormat format = new SimpleDateFormat(formatExpression.execute(input), Locale.ENGLISH);
		return format.parse(expression.execute(input));
	}
	
}
