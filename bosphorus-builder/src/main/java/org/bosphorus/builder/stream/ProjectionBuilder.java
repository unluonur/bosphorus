package org.bosphorus.builder.stream;

import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.IStreamWriter;
import org.bosphorus.stream.Projection;

public class ProjectionBuilder<TInput> implements IStreamBuilder<TInput, List<Object>> {

	private List<IExpression<TInput, ?>> expressions;
	
	public ProjectionBuilder(List<IExpression<TInput, ?>> expressions) {
		this.expressions = expressions;
	}

	@Override
	public IStreamWriter<TInput> build(IStreamWriter<List<Object>> output) {
		return new Projection<TInput>(this.expressions, output);
	}

}
