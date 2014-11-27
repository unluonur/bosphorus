package org.bosphorus.builder.old;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.stream.pipe.IPipe;

public class FilterBuilder implements IStreamBuilder {
	private IScalarExecutor<List<Object>, Boolean> expression;

	@Override
	public IPipe<List<Object>> build(IPipe<List<Object>> output) {
		return null;
		//return new Filter<List<Object>>(expression, output);
	}

}
