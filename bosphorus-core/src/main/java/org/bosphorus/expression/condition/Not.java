package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;

public class Not<TInput> extends BaseUnaryCondition<TInput, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2303076151421970778L;

	public Not(IExpression<TInput, Boolean> value) {
		super(value);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return !this.getValue().execute(input);
	}

}
