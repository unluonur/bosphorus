package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class IsNull<TInput, TOutput> extends BaseUnaryCondition<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3636165189362122163L;

	public IsNull(IExpression<TInput, TOutput> value) {
		super(value);
	}

	@Override
	public Boolean execute(TInput input) {
		return this.getValue().execute(input) == null;
	}

}
