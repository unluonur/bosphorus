package org.bosphorus.expression.map;

import java.util.HashMap;
import java.util.Map;

import org.bosphorus.expression.IExpression;

public class MapProjection<TInput> implements IExpression<TInput, Map<String, Object>> {
	private Map<String, IExpression<TInput, ?>> expressions;

	public MapProjection(Map<String, IExpression<TInput, ?>> expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public Map<String, Object> execute(TInput input) throws Exception {
		HashMap<String, Object> result = new HashMap<String, Object>();
		for(String key: expressions.keySet()) {
			result.put(key, expressions.get(key).execute(input));
		}
		return result;
	}

}
