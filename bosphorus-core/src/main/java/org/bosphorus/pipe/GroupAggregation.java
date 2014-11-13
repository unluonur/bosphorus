package org.bosphorus.pipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bosphorus.aggregation.IAggregateFunction;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class GroupAggregation<TInput> extends BaseSyncPipe<TInput> implements IReader<List<Object>> {
	
	private ArrayList<IExpression<TInput, ?>> keyExpressions;
	
	private ArrayList<IAggregateFunction<TInput, ?>> valueExpressions;
	
	private HashMap<ArrayList<Object>, ArrayList<IAggregationBag<TInput, ?>>> map;
	
	public GroupAggregation(ArrayList<IExpression<TInput, ?>> keyExpressions, ArrayList<IAggregateFunction<TInput, ?>> valueExpressions) {
		this.keyExpressions = new ArrayList<IExpression<TInput,?>>();
		this.valueExpressions = new ArrayList<IAggregateFunction<TInput,?>>();
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
			for(IAggregateFunction<TInput, ?> expr: valueExpressions) {
				values.add(expr.newBag());
			}
			map.put(keys,  values);
		}
		for(IAggregationBag<TInput, ?> bag: values) {
			bag.execute(input);
		}
	}

}
