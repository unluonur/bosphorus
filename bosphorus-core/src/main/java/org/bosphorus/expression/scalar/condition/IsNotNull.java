package org.bosphorus.expression.scalar.condition;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class IsNotNull<TInput, TType> extends BaseUnaryCondition<TInput, TType> {

	public IsNotNull(IScalarExecutor<TInput, TType> value) {
		super(value);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return this.getValue().execute(input) != null;
	}

}
