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


package org.bosphorus.api.builder.expression.scalar.string;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression3;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory3;
import org.bosphorus.core.expression.scalar.factory.string.SubStringExecutorFactory;

public class SubStringExpression implements IScalarExpression3<String, Integer, Integer, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IScalarExecutorFactory3<String, Integer, Integer, String> build() {
		return new SubStringExecutorFactory();
	}


}
