package org.bosphorus.expression.scalar.executor.map;

import java.util.Map;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class MapField<TOutput> implements IScalarExecutor<Map<String, ? extends TOutput>, TOutput> {
	private String name;

	@Override
	public TOutput execute(Map<String, ? extends TOutput> input) throws Exception {
		return (TOutput)input.get(name);
	}

}
