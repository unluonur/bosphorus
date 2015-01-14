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


package org.bosphorus.api.builder.expression.scalar.string;

import java.util.Date;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.core.expression.scalar.factory.string.ParseDateConstExecutorFactory;

public class ParseDateConstExpression implements IScalarExpression1<String, Date> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String formatExpression;
	
	public ParseDateConstExpression(String formatExpression) {
		setFormatExpression(formatExpression);
	}
	
	public String getFormatExpression() {
		return formatExpression;
	}

	public void setFormatExpression(String formatExpression) {
		this.formatExpression = formatExpression;
	}
	
	@Override
	public IScalarExecutorFactory1<String, Date> build() {
		return new ParseDateConstExecutorFactory(getFormatExpression());
	}

}
