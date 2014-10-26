package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class IsNull<TInput, TType> extends BaseUnaryCondition<TInput, TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3636165189362122163L;

	public IsNull(IExpression<TInput, TType> value) {
		super(value);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return this.getValue().execute(input) == null;
	}

}
