package org.bosphorus.expression.aggregate.executor.common;

import java.util.HashMap;
import java.util.Map;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class GroupAggregationExecutor<TInput, TKey, TValue> implements IAggregateExecutor<TInput, Map<TKey, TValue>> {
	private IScalarExecutor<? super TInput, ? extends TKey> keyExpression;
	private IAggregateExecutorFactory<? super TInput, ? extends TValue> valueFactory;
	private HashMap<TKey, IAggregateExecutor<? super TInput, ? extends TValue>> map;
	
	public GroupAggregationExecutor(IScalarExecutor<? super TInput, ? extends TKey> keyExpression, 
			IAggregateExecutorFactory<? super TInput, ? extends TValue> valueExpression) {
		this.keyExpression = keyExpression;
		this.valueFactory = valueExpression;
		this.map = new HashMap<TKey, IAggregateExecutor<? super TInput,? extends TValue>>();
	}

	@Override
	public void execute(TInput input) throws Exception {
		if(input != null) {
			TKey key = keyExpression.execute(input);
			IAggregateExecutor<? super TInput, ? extends TValue> value;
			if(map.containsKey(key)) {
				value = map.get(key);
			}
			else {
				value = valueFactory.create();
				map.put(key,  value);
			}
			value.execute(input);
		}
	}
	
	@Override
	public Map<TKey, TValue> getValue() {
		HashMap<TKey, TValue> result = new HashMap<TKey, TValue>();
		for(TKey key: map.keySet()) {
			result.put(key, map.get(key).getValue());
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
	public void setState(Object state) throws Exception {
		HashMap<TKey, Object> stateMap = (HashMap<TKey, Object>)state;
		for(TKey key: stateMap.keySet()) {
			IAggregateExecutor<? super TInput, ? extends TValue> value = valueFactory.create();
			value.setState(stateMap.get(key));
			map.put(key, value);
		}
	}

}