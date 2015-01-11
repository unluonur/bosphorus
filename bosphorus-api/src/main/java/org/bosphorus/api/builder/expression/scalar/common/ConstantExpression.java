package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression0;
import org.bosphorus.expression.scalar.executor.IScalarExecutor0;
import org.bosphorus.expression.scalar.executor.common.ConstantExecutor;

public class ConstantExpression<TType> implements IScalarExpression0<TType> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TType value;
	
	public ConstantExpression(TType value) {
		this.setValue(value);
	}

	public TType getValue() {
		return value;
	}

	public void setValue(TType value) {
		this.value = value;
	}

	@Override
	public IScalarExecutor0<TType> build() {
		return new ConstantExecutor<TType>(getValue());
	}
	
}
