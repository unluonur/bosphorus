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


package org.bosphorus.core.expression.scalar.factory.string;

import java.util.Date;

import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.core.expression.scalar.executor.string.ParseDateConstExecutor;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;

public class ParseDateConstExecutorFactory implements IScalarExecutorFactory1<String, Date> {
	private ParseDateConstExecutor instance;
	
	public ParseDateConstExecutorFactory(String formatExpression) {
		this.instance = new ParseDateConstExecutor(formatExpression);
	}

	@Override
	public IScalarExecutor1<String, Date> create() {
		return instance;
	}
}
