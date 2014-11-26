package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class ExpressionExecutor<TInput, TType, TOutput> implements IAggregationExecutor<TInput, TOutput> {
	private IExpression<TInput, TType> expression;
	private IAggregationExecutor<TType, TOutput> executor;
	
	public ExpressionExecutor(IExpression<TInput, TType> expression, IAggregationExecutor<TType, TOutput> executor) {
		this.expression = expression;
		this.executor = executor;
	}

	@Override
	public void execute(TInput input) throws Exception {
		executor.execute(expression.execute(input));
	}

	@Override
	public TOutput getValue() {
		return executor.getValue();
	}

	@Override
	public void reset() {
		executor.reset();
	}

}
