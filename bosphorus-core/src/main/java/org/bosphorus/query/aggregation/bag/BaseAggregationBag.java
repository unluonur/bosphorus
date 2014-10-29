package org.bosphorus.query.aggregation.bag;

import org.bosphorus.expression.IExpression;

public abstract class BaseAggregationBag<TOutput, TType> implements IAggregationBag<TOutput> {
	private IExpression<TType> expression;
	
	public BaseAggregationBag(IExpression<TType> expression) {
		this.setExpression(expression);
	}

	public IExpression<TType> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<TType> expression) {
		this.expression = expression;
	}
}
