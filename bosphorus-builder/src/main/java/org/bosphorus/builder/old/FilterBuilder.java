package org.bosphorus.builder.old;

import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.Filter;
import org.bosphorus.stream.IStreamWriter;

public class FilterBuilder implements IStreamBuilder {
	private IExpression<List<Object>, Boolean> expression;

	@Override
	public IStreamWriter<List<Object>> build(IStreamWriter<List<Object>> output) {
		return new Filter<List<Object>>(expression, output);
	}

}
