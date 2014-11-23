package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;

public class Not<TInput> extends BaseUnaryCondition<TInput, Boolean> {

	public Not(IExpression<TInput, Boolean> value) {
		super(value);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return !this.getValue().execute(input);
	}

}
