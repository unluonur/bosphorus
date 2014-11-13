package org.bosphorus.builder.old;

import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.pipe.IPipe;

public class FilterBuilder implements IStreamBuilder {
	private IExpression<List<Object>, Boolean> expression;

	@Override
	public IPipe<List<Object>> build(IPipe<List<Object>> output) {
		return null;
		//return new Filter<List<Object>>(expression, output);
	}

}
