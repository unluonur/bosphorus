package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public abstract class BaseExpressionAggregation<TOutput, TType> implements IAggregation<TOutput, TType> {
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

	@Override
	public void execute(ITuple input, IAggregationBag<TOutput, TType> bag)
			throws Exception {
		bag.execute(this.getExpression().execute(input));
	}
}
