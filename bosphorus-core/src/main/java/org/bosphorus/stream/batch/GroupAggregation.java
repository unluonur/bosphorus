package org.bosphorus.stream.batch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.factory.IAggregationFactory;
import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.pipe.BaseSyncPipe;

public class GroupAggregation<TInput, TKey, TValue> extends BaseSyncPipe<TInput> implements IReader<List<AggregationResult<TKey, TValue>>> {
	private IExpression<TInput, ? extends TKey> keyExpression;
	private IAggregationFactory<TInput, ? extends TValue> valueExpression;
	private HashMap<TKey, IAggregationExecutor<TInput, ? extends TValue>> map;

	public GroupAggregation(IExpression<TInput, ? extends TKey> keyExpression, IAggregationFactory<TInput, ? extends TValue> valueExpression) {
		this.keyExpression = keyExpression;
		this.valueExpression = valueExpression;
		this.map = new HashMap<TKey, IAggregationExecutor<TInput, ? extends TValue>>();
	}

	@Override
	public List<AggregationResult<TKey, TValue>> read() throws Exception {
		synchronized (lockObject) {
			ArrayList<AggregationResult<TKey, TValue>> result = new ArrayList<AggregationResult<TKey,TValue>>(map.size());
			for(TKey key: map.keySet()) {
				IAggregationExecutor<TInput, ? extends TValue> value = map.get(key);
				result.add(new AggregationResult<TKey, TValue>(key, value.getValue()));
			}
			map.clear();
			return result;
		}
	}
	
	@Override
	protected void process(TInput input) throws Exception {
		TKey key = keyExpression.execute(input);
		IAggregationExecutor<TInput, ? extends TValue> value;
		if(map.containsKey(key)) {
			value = map.get(key);
		}
		else {
			value = valueExpression.create();
			map.put(key,  value);
		}
		value.execute(input);
	}

}
