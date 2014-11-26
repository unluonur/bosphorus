package org.bosphorus.expression.scalar.map;

import java.util.HashMap;
import java.util.Map;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class MapProjection<TInput, TOutput> implements IScalarExecutor<TInput, Map<String, TOutput>> {
	private Map<String, IScalarExecutor<TInput, ? extends TOutput>> expressions;

	public MapProjection(Map<String, IScalarExecutor<TInput, ? extends TOutput>> expressions) {
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
