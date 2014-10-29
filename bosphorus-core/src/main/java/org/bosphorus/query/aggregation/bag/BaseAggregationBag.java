package org.bosphorus.query.aggregation.bag;

import org.bosphorus.expression.IExpression;

public abstract class BaseAggregationBag<TInput, TOutput, TType> implements IAggregationBag<TInput, TOutput> {
	private IExpression<TInput, TType> expression;
	
	public BaseAggregationBag(IExpression<TInput, TType> expression) {
		this.setExpression(expression);
	}

	public IExpression<TInput, TType> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<TInput, TType> expression) {
		this.expression = expression;
	}
}
