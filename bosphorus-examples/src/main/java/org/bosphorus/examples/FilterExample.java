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


package org.bosphorus.examples;

import java.util.Arrays;
import java.util.List;

import org.bosphorus.api.builder.ListStreamBuilder;
import org.bosphorus.core.stream.IPipeExecutor;

public class FilterExample {
	public static void main(String[] args) throws Exception {
		ListStreamBuilder ss = new ListStreamBuilder("Id", "City", "Value");
		
		IPipeExecutor<List<Object>> executor = 
				ss.filter(ss.equals(ss.stringField("City"), "�stanbul"))
				.then(ss.consoleLog())
				.build();
		
		executor.writeOne(Arrays.asList(1, "�stanbul", 100));
		executor.writeOne(Arrays.asList(1, "�stanbul", 110));
		executor.writeOne(Arrays.asList(2, "Ankara", 95));
		executor.writeOne(Arrays.asList(1, "�stanbul", 125));
		executor.writeOne(Arrays.asList(2, "Ankara", 120));
	}

}
