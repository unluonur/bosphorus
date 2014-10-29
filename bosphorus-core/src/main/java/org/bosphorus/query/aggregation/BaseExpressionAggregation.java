package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;

public abstract class BaseExpressionAggregation<TOutput, TType> implements IAggregation<TOutput> {
	private IExpression<TType> expression;
	
	public BaseExpressionAggregation(IExpression<TType> expression) {
		this.setExpression(expression);
	}

	public IExpression<TType> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<TType> expression) {
		this.expression = expression;
	}

}
