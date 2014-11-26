package org.bosphorus.expression.scalar.condition;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class IsNull<TInput, TType> extends BaseUnaryCondition<TInput, TType> {

	public IsNull(IScalarExecutor<TInput, TType> value) {
		super(value);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return this.getValue().execute(input) == null;
	}

}
