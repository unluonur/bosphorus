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

import java.util.List;

import org.bosphorus.core.expression.scalar.executor.IScalarExecutor2;
import org.bosphorus.core.expression.scalar.executor.string.StrSplitExecutor;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory2;

public class StrSplitExecutorFactory implements IScalarExecutorFactory2<String, String, List<String>> {
	private static StrSplitExecutor instance = new StrSplitExecutor();

	@Override
	public IScalarExecutor2<String, String, List<String>> create() {
		return instance;
	}

}
