package org.bosphorus.topology.builder;

import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.pipe.IPipe;
import org.bosphorus.pipe.Projection;

public class ProjectionBuilder<TInput> implements IStreamBuilder<TInput, List<Object>> {

	private List<IExpression<TInput, ?>> expressions;
	
	public ProjectionBuilder(List<IExpression<TInput, ?>> expressions) {
		this.expressions = expressions;
	}

	@Override
	public IPipe<TInput> build(IPipe<List<Object>> output) {
		return new Projection<TInput>(this.expressions, output);
	}

}
