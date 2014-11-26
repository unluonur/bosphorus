package org.bosphorus.expression.batch;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class ExpressionExecutor<TInput, TType, TOutput> implements IBatchExecutor<TInput, TOutput> {
	private IScalarExecutor<TInput, TType> expression;
	private IBatchExecutor<TType, TOutput> executor;
	
	public ExpressionExecutor(IScalarExecutor<TInput, TType> expression, IBatchExecutor<TType, TOutput> executor) {
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

	@Override
	public Object getState() {
		return this.executor.getState();
	}

	@Override
	public void setState(Object state) {
		this.executor.setState(state);
	}

}
