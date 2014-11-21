package org.bosphorus.stream.batch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.factory.IAggregationFactory;
import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.pipe.BaseSyncPipe;

public class GroupAggregation<TInput> extends BaseSyncPipe<TInput> implements IReader<List<Object>> {
	
	private ArrayList<IExpression<TInput, ?>> keyExpressions;
	
	private ArrayList<IAggregationFactory<TInput, ?>> valueExpressions;
	
	private HashMap<ArrayList<Object>, ArrayList<IAggregationBag<TInput, ?>>> map;
	
	public GroupAggregation(ArrayList<IExpression<TInput, ?>> keyExpressions, ArrayList<IAggregationFactory<TInput, ?>> valueExpressions) {
		this.keyExpressions = new ArrayList<IExpression<TInput,?>>();
		this.valueExpressions = new ArrayList<IAggregationFactory<TInput,?>>();
	}
	
	@Override
	public List<List<Object>> read() throws Exception {
		synchronized (lockObject) {
			ArrayList<List<Object>> result = new ArrayList<List<Object>>();
			for(ArrayList<Object> key: map.keySet()) {
				ArrayList<Object> tuple = new ArrayList<Object>();
				tuple.addAll(key);
				for(IAggregationBag<TInput, ?> bag: map.get(key)) {
					tuple.add(bag.getValue());
				}
			}
			map.clear();
			return result;
		}
	}
	
	@Override
	protected void process(TInput input) throws Exception {
		ArrayList<Object> keys = new ArrayList<Object>();
		ArrayList<IAggregationBag<TInput, ?>> values;
		for(IExpression<TInput, ?> expr: keyExpressions) {
			keys.add(expr.execute(input));
		}
		if(map.containsKey(keys)) {
			values = map.get(keys);
		}
		else {
			values = new ArrayList<IAggregationBag<TInput, ?>>();
			for(IAggregationFactory<TInput, ?> expr: valueExpressions) {
				values.add(expr.create());
			}
			map.put(keys,  values);
		}
		for(IAggregationBag<TInput, ?> bag: values) {
			bag.execute(input);
		}
	}

}
