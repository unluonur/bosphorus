package org.bosphorus.aggregation.executor;

import java.util.List;

import org.bosphorus.expression.IExpression;

public class ListExpressionExecutor<TInput, TType, TOutput> implements IAggregationExecutor<TInput, TOutput> {
	private IExpression<TInput, List<TType>> expression;
	private IAggregationExecutor<TType, TOutput> executor;
	
	public ListExpressionExecutor(IExpression<TInput, List<TType>> expression, IAggregationExecutor<TType, TOutput> executor) {
		this.expression = expression;
		this.executor = executor;
	}

	@Override
	public void execute(TInput input) throws Exception {
		for(TType value: expression.execute(input)) {
			executor.execute(value);
		}
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
