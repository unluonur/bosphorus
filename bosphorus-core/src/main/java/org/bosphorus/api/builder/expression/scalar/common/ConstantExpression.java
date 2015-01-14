package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression0;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory0;
import org.bosphorus.core.expression.scalar.factory.common.ConstantExecutorFactory;

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
	public IScalarExecutorFactory0<TType> build() {
		return new ConstantExecutorFactory<TType>(getValue());
	}
	
}
