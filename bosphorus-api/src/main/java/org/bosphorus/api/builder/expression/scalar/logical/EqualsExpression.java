package org.bosphorus.api.builder.expression.scalar.logical;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression2;
import org.bosphorus.expression.scalar.executor.IScalarExecutor2;
import org.bosphorus.expression.scalar.executor.logical.EqualsExecutor;

public class EqualsExpression<TType extends Comparable<TType>> implements IScalarExpression2<TType, TType, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public IScalarExecutor2<TType, TType, Boolean> build() {
		return new EqualsExecutor<TType>();
	}

}
