package org.bosphorus.expression.aggregate.executor.math;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public class MedianDoubleExecutor implements IAggregateExecutor<Number, Double> {
	private List<Number> list;
	
	public MedianDoubleExecutor() {
		list = new ArrayList<Number>();
	}

	@Override
	public void execute(Number input) throws Exception {
		if(input != null) {
			list.add(input);
		}
	}

	@Override
	public Double getValue() {
		Integer size = list.size();
		if(size == 0) {
			return null;
		}
		if(size % 2 == 1) {
			return list.get(size / 2).doubleValue();
		}
		else {
			return (list.get(size / 2 - 1).doubleValue() + list.get(size / 2).doubleValue()) / 2;
		}
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
