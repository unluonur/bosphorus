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


package org.bosphorus.core.stream.pipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bosphorus.core.stream.IPipeExecutor;

public class SampleExecutor<TInput> implements IPipeExecutor<TInput> {
	
	private Double samplingRate;
	private Random random;
	private IPipeExecutor<? super TInput> outputStream;
	
	public SampleExecutor(Double samplingRate, IPipeExecutor<? super TInput> outputStream) {
		this.random = new Random();
		this.samplingRate = samplingRate;
		this.outputStream = outputStream;
	}

	@Override
	public void writeOne(TInput input) throws Exception {
		if(random.nextDouble() <= samplingRate) {
			outputStream.writeOne(input);
		}
	}

	@Override
	public void writeMulti(List<? extends TInput> input) throws Exception {
		ArrayList<TInput> result = new ArrayList<TInput>();
		for(TInput item: input) {
			if(random.nextDouble() <= samplingRate) {
				result.add(item);
			}
		}
		if(result.size()>0) {
			outputStream.writeMulti(result);
		}
	}
}
