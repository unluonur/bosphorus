package org.bosphorus.core.aggregation;

import org.bosphorus.core.aggregation.bag.IAggregationBag;
import org.bosphorus.core.expression.IExpression;

public abstract class BaseExpressionAggregation<TInput, TOutput, TType> implements IAggregation<TInput, TOutput, TType> {
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

	@Override
	public void execute(TInput input, IAggregationBag<TOutput, TType> bag)
			throws Exception {
		bag.execute(this.getExpression().execute(input));
	}
}
