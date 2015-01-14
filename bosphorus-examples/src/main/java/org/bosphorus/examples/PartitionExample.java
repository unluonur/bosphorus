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
import java.util.Date;
import java.util.List;

import org.bosphorus.api.builder.ListStreamBuilder;
import org.bosphorus.api.builder.stream.IStreamInput;
import org.bosphorus.core.stream.IPipeExecutor;

public class PartitionExample {
	

	public static void main(String[] args) throws Exception {
		ListStreamBuilder ss = new ListStreamBuilder("SensorId", "Value", "Date");

		IStreamInput<List<Object>> pipe = ss.projection(
			ss.partition(
				ss.integerField("SensorId"), // Partition key
				ss.list(
					ss.identityInteger(),
					ss.integerField("SensorId"),
					ss.previous(ss.doubleField("Value")), // previous value
					ss.doubleField("Value"), // current value
					ss.previous(ss.dateField("Date")), // previous date
					ss.doubleField("Date") // current date
				)
			)
		).then(ss.consoleLog());
		
		IPipeExecutor<List<Object>> executor = pipe.build();
		
		executor.writeOne(Arrays.asList(1, 100, new Date(115, 0, 15, 21, 00, 00)));
		executor.writeOne(Arrays.asList(1, 110, new Date(115, 0, 15, 21, 01, 00)));
		executor.writeOne(Arrays.asList(2, 95, new Date(115, 0, 15, 21, 02, 00)));
		executor.writeOne(Arrays.asList(1, 125, new Date(115, 0, 15, 21, 03, 00)));
		executor.writeOne(Arrays.asList(2, 120, new Date(115, 0, 15, 21, 04, 00)));
	}

}
