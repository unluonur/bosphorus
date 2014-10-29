package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;

public abstract class BaseExpressionAggregation<TInput, TOutput, TType> implements IAggregation<TInput, TOutput> {
	private IExpression<TInput, TType> expression;
	
	public BaseExpressionAggregation(IExpression<TInput, TType> expression) {
		this.setExpression(expression);
	}

	public IExpression<TInput, TType> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<TInput, TType> expression) {
		this.expression = expression;
	}

}
