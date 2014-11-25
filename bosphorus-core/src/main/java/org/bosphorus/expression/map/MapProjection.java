package org.bosphorus.expression.map;

import java.util.HashMap;
import java.util.Map;

import org.bosphorus.expression.IExpression;

public class MapProjection<TInput, TOutput> implements IExpression<TInput, Map<String, TOutput>> {
	private Map<String, IExpression<TInput, ? extends TOutput>> expressions;

	public MapProjection(Map<String, IExpression<TInput, ? extends TOutput>> expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public Map<String, TOutput> execute(TInput input) throws Exception {
		HashMap<String, TOutput> result = new HashMap<String, TOutput>();
		for(String key: expressions.keySet()) {
			result.put(key, expressions.get(key).execute(input));
		}
		return result;
	}

}
