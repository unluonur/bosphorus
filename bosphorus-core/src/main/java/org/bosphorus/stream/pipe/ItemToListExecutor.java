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

package org.bosphorus.stream.pipe;

import java.util.List;

import org.bosphorus.stream.IPipeExecutor;

public class ItemToListExecutor<TType> implements IPipeExecutor<List<? extends TType>> {
	private IPipeExecutor<? super TType> output;

	@Override
	public void writeOne(List<? extends TType> input) throws Exception {
		output.writeMulti(input);
	}

	@Override
	public void writeMulti(List<? extends List<? extends TType>> input) throws Exception {
		for(List<? extends TType> list: input) {
			output.writeMulti(list);
		}
	}

}
