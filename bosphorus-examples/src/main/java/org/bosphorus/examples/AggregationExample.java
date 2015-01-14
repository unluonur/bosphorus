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


package org.bosphorus.examples;

import java.util.Arrays;
import java.util.List;

import org.bosphorus.api.builder.ListStreamBuilder;
import org.bosphorus.api.builder.stream.IStreamInput;
import org.bosphorus.core.stream.IPipeExecutor;

public class AggregationExample {
	public static void main(String[] args) throws Exception {
		ListStreamBuilder ss = new ListStreamBuilder("Id", "Value");

		IStreamInput<List<Object>> pipe = ss.aggregate(
			ss.list(
				ss.sumDouble(ss.doubleField("Value")),
				ss.avgDouble(ss.doubleField("Value")),
				ss.stdDevDouble(ss.doubleField("Value"))
			), 1000 // window interval (ms)
		).then(ss.consoleLog());
		
		IPipeExecutor<List<Object>> executor = pipe.build();
		
		executor.writeOne(Arrays.asList(1, 100));
		executor.writeOne(Arrays.asList(1, 110));
		executor.writeOne(Arrays.asList(2, 95));
		executor.writeOne(Arrays.asList(1, 125));
		executor.writeOne(Arrays.asList(2, 120));

	}

}
