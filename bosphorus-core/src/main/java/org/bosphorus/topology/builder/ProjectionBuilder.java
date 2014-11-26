package org.bosphorus.topology.builder;

import org.bosphorus.expression.scalar.IScalarExecutor;
import org.bosphorus.stream.pipe.IPipe;
import org.bosphorus.stream.pipe.Projection;

public class ProjectionBuilder<TInput, TOutput> implements IStreamBuilder<TInput, TOutput> {

	private IScalarExecutor<TInput, TOutput> expression;
	
	public ProjectionBuilder(IScalarExecutor<TInput, TOutput> expression) {
		this.expression = expression;
	}

	@Override
	public IPipe<TInput> build(IPipe<TOutput> output) {
		return new Projection<TInput, TOutput>(this.expression, output);
	}

}
