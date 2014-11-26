package org.bosphorus.expression.batch;

import java.util.List;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class ListExpressionExecutor<TInput, TType, TOutput> implements IBatchExecutor<TInput, TOutput> {
	private IScalarExecutor<TInput, List<TType>> expression;
	private IBatchExecutor<TType, TOutput> executor;
	
	public ListExpressionExecutor(IScalarExecutor<TInput, List<TType>> expression, IBatchExecutor<TType, TOutput> executor) {
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
	public void setState(Object state) {
		this.executor.setState(state);
	}

}
