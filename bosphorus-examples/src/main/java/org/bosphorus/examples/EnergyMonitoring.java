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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import org.bosphorus.api.builder.stream.ConsoleLogPipe;
import org.bosphorus.api.builder.stream.FilterPipe;
import org.bosphorus.api.builder.stream.IStreamInput;
import org.bosphorus.api.builder.stream.OneToManyPipe;
import org.bosphorus.api.fluent.stream.ListStream;
import org.bosphorus.stream.IPipeExecutor;
import org.bosphorus.stream.pipe.OneToManyExecutor;

public class EnergyMonitoring {
	
	public static class DataGenerator {
		private String tenant;
		private String location;
		private String source;
		private String unit;
		private double currentValue;
		private double minValue;
		private double maxValue;
		private long delay;
		private Random random;
		
		public DataGenerator(
			String tenant,
			String location,
			String source,
			String unit,
			double currentValue,
			double minValue,
			double maxValue,
			long delay
		) {
			this.tenant = tenant;
			this.location = location;
			this.source = source;
			this.unit = unit;
			this.currentValue = currentValue;
			this.minValue = minValue;
			this.maxValue = maxValue;
			this.delay = delay;
			this.random = new Random();
		}
		
		public void start(IPipeExecutor<List<Object>> executor) {
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				
				@Override
				public void run() {
					try {
						currentValue += minValue + (maxValue - minValue) * random.nextDouble();
						ArrayList<Object> data = new ArrayList<Object>();
						data.add(tenant);
						data.add(location);
						data.add(source);
						data.add(unit);
						data.add(currentValue);
						executor.writeOne(data);
						//Thread.sleep(delay);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}, 1, delay);
		}
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		DataGenerator[] generators = new DataGenerator[] {
				new DataGenerator("tenant 1", "Ýstanbul", "elektrik", "MW", 0, 0.1, 0.3, 10L),
				new DataGenerator("tenant 1", "Ýstanbul", "Su", "lt", 0, 50, 100, 10L),
				new DataGenerator("tenant 1", "Ýstanbul", "Doðalgaz", "m3", 0, 0.2, 0.4, 20L),
				new DataGenerator("tenant 1", "Ankara", "elektrik", "MW", 0, 0.2, 0.5, 10L),
				new DataGenerator("tenant 1", "Ankara", "Su", "lt", 0, 70, 110, 30L),
				new DataGenerator("tenant 1", "Ankara", "Doðalgaz", "m3", 0, 0.1, 0.2, 10L),
				new DataGenerator("tenant 2", "Ýstanbul", "elektrik", "MW", 0, 0.7, 0.9, 20L),
				new DataGenerator("tenant 2", "Ýstanbul", "Su", "lt", 0, 20, 35, 20L),
				new DataGenerator("tenant 2", "Ýstanbul", "Doðalgaz", "m3", 0, 0.15, 0.35, 10L),
				new DataGenerator("tenant 2", "Ýzmir", "elektrik", "MW", 0, 0.4, 0.6, 30L),
				new DataGenerator("tenant 2", "Ýzmir", "Su", "lt", 0, 50, 90, 10L),
				new DataGenerator("tenant 2", "Ýzmir", "Doðalgaz", "m3", 0, 0.2, 0.4, 20L)
		};
		ListStream stream = new ListStream("Tenant", "Location", "Source", "Unit", "Value");

		IStreamInput<List<Object>> pipe = new OneToManyPipe<List<Object>>()
				//.then(new ConsoleLogPipe<List<Object>>())
				.then(new FilterPipe<List<Object>>(stream.field("Location").stringValue().isEqualTo("Ýstanbul"))
						.then(new ConsoleLogPipe<List<Object>>()));
		
		IPipeExecutor<List<Object>> executor = pipe.build();
		for(DataGenerator generator: generators) {
			generator.start(executor);
		}
	}

}
