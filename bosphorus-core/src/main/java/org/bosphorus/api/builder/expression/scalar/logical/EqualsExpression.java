package org.bosphorus.api.builder.expression.scalar.logical;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression2;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory2;
import org.bosphorus.core.expression.scalar.factory.logical.EqualsExecutorFactory;

public class EqualsExpression<TType extends Comparable<TType>> implements IScalarExpression2<TType, TType, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public IScalarExecutorFactory2<TType, TType, Boolean> build() {
		return new EqualsExecutorFactory<TType>();
	}

}
