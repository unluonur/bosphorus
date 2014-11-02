package org.bosphorus.aggregation.bag;

import org.bosphorus.expression.IExpression;

public class SumBagInteger<TInput> extends BaseAggregationBag<TInput, Integer, Integer> {
	private Integer sum;
	
	public SumBagInteger(IExpression<TInput, Integer> expression) {
		super(expression);
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += this.getExpression().execute(input);
	}

	@Override
	public Integer getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0;
	}

}
