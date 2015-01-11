package org.bosphorus.api.builder.expression.scalar.logical;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.expression.scalar.executor.logical.IsNotNullExecutor;

public class IsNotNullExpression implements IScalarExpression1<Object, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IScalarExecutor1<Object, Boolean> build() {
		return new IsNotNullExecutor();
	}

}
