package org.bosphorus.builder.old;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.stream.IPipeExecutor;

public class FilterBuilder implements IStreamBuilder {
	private IScalarExecutor<List<Object>, Boolean> expression;

	@Override
	public IPipeExecutor<List<Object>> build(IPipeExecutor<List<Object>> output) {
		return null;
		//return new Filter<List<Object>>(expression, output);
	}

}
