package org.bosphorus.expression.aggregate.executor.math;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public class StdDevExecutor implements IAggregateExecutor<Number, Double> {
	private List<Number> list;
	
	public StdDevExecutor() {
		list = new ArrayList<Number>();
		reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		list.add(input);
	}

	@Override
	public Double getValue() {
		Integer size = list.size();
		if(size == 0) {
			return null;
		}
		Double sum = 0.0;
		for(Number num: list) {
			sum += num.doubleValue();
		}
		Double avg = sum / size;
		Double var = 0.0;
		for(Number num: list) {
			Double d = num.doubleValue();
			var += (d - avg) * (d - avg);
		}
		return Math.sqrt(var);
	}

	@Override
	public void reset() {
		list.clear();
	}

	@Override
	public Object getState() {
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		list = (List<Number>)state;
	}

}
