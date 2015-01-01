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

package org.bosphorus.expression.scalar.executor.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ParseDateConstExecutor<TInput> implements IScalarExecutor<TInput, Date> {
	private IScalarExecutor<? super TInput, String> expression;
	private final ThreadLocal<DateFormat> dateFormat;

	public ParseDateConstExecutor(IScalarExecutor<? super TInput, String> expression, 
			String formatExpression) {
		this.expression = expression;
		this.dateFormat = new ThreadLocal<DateFormat>(){
			@Override
			protected DateFormat initialValue() {
				return new SimpleDateFormat(formatExpression, Locale.ENGLISH);
			}
		};
	}

	@Override
	public Date execute(TInput input) throws Exception {
		return dateFormat.get().parse(expression.execute(input));
	}
	
}
