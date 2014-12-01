package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.common.ConstantExecutor;

public class ConstantExpression<TInput, TOutput> implements IScalarExpression<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TOutput value;
	
	public ConstantExpression(TOutput value) {
		this.setValue(value);
	}

	public TOutput getValue() {
		return value;
	}

	public void setValue(TOutput value) {
		this.value = value;
	}

	@Override
	public IScalarExecutor<TInput, TOutput> build() {
		return new ConstantExecutor<TInput, TOutput>(getValue());
	}
	
}
