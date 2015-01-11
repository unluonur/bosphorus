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

package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.BaseStatelessExecutor2;

public class NotEqualsExecutor<TType extends Comparable<TType>> extends BaseStatelessExecutor2<TType, TType, Boolean> {
	
	public Boolean execute(TType input1, TType input2) throws Exception {
		if(input1 == null) {
			return input2 != null;
		}
		return !input1.equals(input2);
	}

}
