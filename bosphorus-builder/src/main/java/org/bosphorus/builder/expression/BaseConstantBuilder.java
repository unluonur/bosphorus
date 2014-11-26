package org.bosphorus.builder.expression;

import org.bosphorus.expression.scalar.ConstantExecutor;
import org.bosphorus.expression.scalar.IScalarExecutor;

public abstract class BaseConstantBuilder<TInput, TOutput> implements IExpressionBuilder<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TOutput value;

	public TOutput getValue() {
		return value;
	}

	public void setValue(TOutput value) {
		this.value = value;
	}

	@Override
	public IScalarExecutor<TInput, TOutput> build() {
		return new ConstantExecutor<TInput, TOutput>(this.getValue());
	}

}
