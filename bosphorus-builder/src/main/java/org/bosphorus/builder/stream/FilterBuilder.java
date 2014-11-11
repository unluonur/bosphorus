package org.bosphorus.builder.stream;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.Filter;
import org.bosphorus.stream.IStreamWriter;

public class FilterBuilder<TInput> implements IStreamBuilder<TInput, TInput> {

	private IExpression<TInput, Boolean> expression;
	
	public FilterBuilder(IExpression<TInput, Boolean> expression) {
		this.expression = expression;
	}

	@Override
	public IStreamWriter<TInput> build(IStreamWriter<TInput> output) {
		return new Filter<TInput>(this.expression, output);
	}

}
