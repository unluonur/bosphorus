package org.bosphorus.expression.scalar.executor.condition;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class IsNotNullExecutor<TInput, TType> extends BaseUnaryConditionExecutor<TInput, TType> {

	public IsNotNullExecutor(IScalarExecutor<TInput, TType> value) {
		super(value);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return this.getValue().execute(input) != null;
	}

}
