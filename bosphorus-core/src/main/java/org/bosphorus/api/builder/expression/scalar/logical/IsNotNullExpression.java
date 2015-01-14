package org.bosphorus.api.builder.expression.scalar.logical;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.core.expression.scalar.factory.logical.IsNotNullExecutorFactory;

public class IsNotNullExpression implements IScalarExpression1<Object, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IScalarExecutorFactory1<Object, Boolean> build() {
		return new IsNotNullExecutorFactory();
	}

}
