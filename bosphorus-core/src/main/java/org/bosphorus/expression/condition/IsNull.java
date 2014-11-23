package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;

public class IsNull<TInput, TType> extends BaseUnaryCondition<TInput, TType> {

	public IsNull(IExpression<TInput, TType> value) {
		super(value);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return this.getValue().execute(input) == null;
	}

}
