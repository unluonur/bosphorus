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


package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression0;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory0;
import org.bosphorus.core.expression.scalar.factory.common.RandomSeedExecutorFactory;

public class RandomSeedExpression implements IScalarExpression0<Double> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long seed;
	
	public RandomSeedExpression(Long seed) {
		setSeed(seed);
	}

	public Long getSeed() {
		return seed;
	}

	public void setSeed(Long seed) {
		this.seed = seed;
	}

	@Override
	public IScalarExecutorFactory0<Double> build() {
		return new RandomSeedExecutorFactory(getSeed());
	}

}
