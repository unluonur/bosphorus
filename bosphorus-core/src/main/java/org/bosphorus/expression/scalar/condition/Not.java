package org.bosphorus.expression.scalar.condition;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class Not<TInput> extends BaseUnaryCondition<TInput, Boolean> {

	public Not(IScalarExecutor<TInput, Boolean> value) {
		super(value);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return !this.getValue().execute(input);
	}

}
