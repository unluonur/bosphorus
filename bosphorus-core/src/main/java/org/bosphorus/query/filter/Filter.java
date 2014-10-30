package org.bosphorus.query.filter;

import org.bosphorus.expression.IExpression;

public class Filter<TInput> implements IFilter<TInput> {
	private IExpression<TInput, Boolean> expression;

	@Override
	public Boolean isMatch(TInput input) throws Exception {
		return expression.execute(input);
	}

}
