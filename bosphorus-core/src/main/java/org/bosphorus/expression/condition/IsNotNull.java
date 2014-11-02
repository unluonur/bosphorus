package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;

public class IsNotNull<TInput, TType> extends BaseUnaryCondition<TInput, TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4900316036835479432L;

	public IsNotNull(IExpression<TInput, TType> value) {
		super(value);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return this.getValue().execute(input) != null;
	}

}
