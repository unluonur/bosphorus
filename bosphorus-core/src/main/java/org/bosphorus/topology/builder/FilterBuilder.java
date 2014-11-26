package org.bosphorus.topology.builder;

import org.bosphorus.expression.scalar.IScalarExecutor;
import org.bosphorus.stream.pipe.Filter;
import org.bosphorus.stream.pipe.IPipe;

public class FilterBuilder<TInput> implements IStreamBuilder<TInput, TInput> {

	private IScalarExecutor<TInput, Boolean> expression;
	
	public FilterBuilder(IScalarExecutor<TInput, Boolean> expression) {
		this.expression = expression;
	}

	@Override
	public IPipe<TInput> build(IPipe<TInput> output) {
		return new Filter<TInput>(this.expression, output);
	}

}
