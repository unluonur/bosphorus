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

package org.bosphorus.stream.batch.join;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.stream.IReader;

public class StreamJoin<TInput> implements IReader<List<List<TInput>>> {
	private IReader<List<TInput>> maimStream;

	@Override
	public List<List<TInput>> read() throws Exception {
		List<TInput> data = maimStream.read();
		ArrayList<List<TInput>> result = new ArrayList<List<TInput>>();
		for(TInput tuple: data) {
			ArrayList<TInput> aggregateTuple = new ArrayList<TInput>();
			aggregateTuple.add(tuple);
			result.add(aggregateTuple);
		}
		return result;
	}

}
