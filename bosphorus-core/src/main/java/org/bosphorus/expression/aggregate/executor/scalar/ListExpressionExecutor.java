package org.bosphorus.expression.aggregate.executor.scalar;

import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ListExpressionExecutor<TInput, TType, TOutput> implements IAggregateExecutor<TInput, TOutput> {
	private IScalarExecutor<TInput, List<TType>> expression;
	private IAggregateExecutor<TType, TOutput> executor;
	
	public ListExpressionExecutor(IScalarExecutor<TInput, List<TType>> expression, IAggregateExecutor<TType, TOutput> executor) {
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

	@Override
	public Object getState() {
		return this.executor.getState();
	}

	@Override
	public void setState(Object state) throws Exception {
		this.executor.setState(state);
	}

}
