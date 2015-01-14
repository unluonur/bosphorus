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


package org.bosphorus.core.expression.scalar.executor.common;

import java.util.Random;

import org.bosphorus.core.expression.scalar.executor.BaseStatelessExecutor0;

public class RandomExecutor extends BaseStatelessExecutor0<Double> {
	private Random random;

	public RandomExecutor() {
		this.random = new Random();
	}
	
	public RandomExecutor(Long seed) {
		this.random = new Random(seed);
	}
	
	public Double execute() {
		return random.nextDouble();
	}

}
