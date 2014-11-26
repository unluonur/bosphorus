package org.bosphorus.builder.expression;

import org.bosphorus.expression.scalar.ConstantExecutor;
import org.bosphorus.expression.scalar.IScalarExecutor;

public class ConstantBuilder<TInput, TOutput> implements IExpressionBuilder<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TOutput value;

	@Override
	public String serialize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IScalarExecutor<TInput, TOutput> build() {
		return new ConstantExecutor<TInput, TOutput>(value);
	}

}
