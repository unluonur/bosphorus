package org.bosphorus.expression.map;

import java.util.Map;

import org.bosphorus.expression.IExpression;

public class MapField<TOutput> implements IExpression<Map<String, Object>, TOutput> {
	private String name;

	@SuppressWarnings("unchecked")
	@Override
	public TOutput execute(Map<String, Object> input) throws Exception {
		return (TOutput)input.get(name);
	}

}
