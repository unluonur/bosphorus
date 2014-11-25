package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class MinExecutor<TInput, TOutput extends Comparable<TOutput>> implements IAggregationExecutor<TInput, TOutput> {
	private IExpression<TInput, TOutput> expression;
	private TOutput value;
	
	public MinExecutor(IExpression<TInput, TOutput> expression) {
		this.expression = expression;
		this.reset();
	}

	@Override
	public void execute(TInput input) throws Exception {
		TOutput expr = expression.execute(input);
		if(this.value == null || this.value.compareTo(expr) > 0) {
			this.value = expr;
		}
	}

	@Override
	public TOutput getValue() {
		return this.value;
	}

	@Override
	public void reset() {
		value = null;
	}

}
