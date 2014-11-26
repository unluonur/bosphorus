package org.bosphorus.expression.batch;

import java.util.HashMap;
import java.util.Map;

import org.bosphorus.expression.batch.factory.IBatchExecutorFactory;
import org.bosphorus.expression.scalar.IScalarExecutor;

public class GroupAggregationExecutor<TInput, TKey, TValue> implements IBatchExecutor<TInput, Map<TKey, TValue>> {
	private IScalarExecutor<TInput, ? extends TKey> keyExpression;
	private IBatchExecutorFactory<TInput, ? extends TValue> valueExpression;
	private HashMap<TKey, IBatchExecutor<TInput, ? extends TValue>> map;
	
	public GroupAggregationExecutor(IScalarExecutor<TInput, ? extends TKey> keyExpression, IBatchExecutorFactory<TInput, ? extends TValue> valueExpression) {
		this.keyExpression = keyExpression;
		this.valueExpression = valueExpression;
		this.map = new HashMap<TKey, IBatchExecutor<TInput,? extends TValue>>();
	}

	@Override
	public void execute(TInput input) throws Exception {
		TKey key = keyExpression.execute(input);
		IBatchExecutor<TInput, ? extends TValue> value;
		if(map.containsKey(key)) {
			value = map.get(key);
		}
		else {
			value = valueExpression.create();
			map.put(key,  value);
		}
		value.execute(input);
	}

	@Override
	public Map<TKey, TValue> getValue() {
		HashMap<TKey, TValue> result = new HashMap<TKey, TValue>();
		for(TKey key: map.keySet()) {
			IBatchExecutor<TInput, ? extends TValue> value = map.get(key);
			result.put(key, value.getValue());
		}
		return result;
	}

	@Override
	public void reset() {
		map.clear();
	}

	@Override
	public Object getState() {
		HashMap<TKey, Object> state = new HashMap<TKey, Object>();
		for(TKey key: this.map.keySet()) {
			state.put(key, this.map.get(key).getState());
		}
		return state;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) {
		HashMap<TKey, Object> stateMap = (HashMap<TKey, Object>)state;
		for(TKey key: stateMap.keySet()) {
			IBatchExecutor<TInput, ? extends TValue> value = valueExpression.create();
			value.setState(stateMap.get(key));
			map.put(key, value);
		}
	}

}
