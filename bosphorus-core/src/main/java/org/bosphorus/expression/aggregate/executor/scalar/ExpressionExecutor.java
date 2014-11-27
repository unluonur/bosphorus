package org.bosphorus.expression.aggregate.executor.scalar;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ExpressionExecutor<TInput, TType, TOutput> implements IAggregateExecutor<TInput, TOutput> {
	private IScalarExecutor<TInput, ? extends TType> expression;
	private IAggregateExecutor<TType, ? extends TOutput> executor;
	
	public ExpressionExecutor(IScalarExecutor<TInput, ? extends TType> expression, IAggregateExecutor<TType, ? extends TOutput> executor) {
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
	public void setState(Object state) throws Exception {
		this.executor.setState(state);
	}

}
