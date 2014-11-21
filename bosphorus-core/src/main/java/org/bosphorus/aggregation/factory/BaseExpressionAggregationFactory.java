package org.bosphorus.aggregation.factory;

import org.bosphorus.expression.IExpression;

public abstract class BaseExpressionAggregationFactory<TInput, TOutput, TType> implements IAggregationFactory<TInput, TOutput> {
	private IExpression<TInput, TType> expression;
	
	public BaseExpressionAggregationFactory(IExpression<TInput, TType> expression) {
		this.setExpression(expression);
	}

	public IExpression<TInput, TType> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<TInput, TType> expression) {
		this.expression = expression;
	}

}
