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

package org.bosphorus.core.expression.scalar.executor.string;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.bosphorus.core.expression.scalar.executor.BaseStatelessExecutor1;

public class ParseDateConstExecutor extends BaseStatelessExecutor1<String, Date> {
	private final ThreadLocal<DateFormat> dateFormat;

	public ParseDateConstExecutor(String formatExpression) {
		this.dateFormat = new ThreadLocal<DateFormat>(){
			@Override
			protected DateFormat initialValue() {
				return new SimpleDateFormat(formatExpression, Locale.ENGLISH);
			}
		};
	}

	@Override
	public Date execute(String input) throws Exception {
		return dateFormat.get().parse(input);
	}
	
}
