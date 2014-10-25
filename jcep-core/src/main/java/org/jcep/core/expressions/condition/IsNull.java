package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.common.IExpression;

public class IsNull<TType, TContext> extends BaseUnaryCondition<TType, TContext> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3636165189362122163L;

	public IsNull(IExpression<TType, TContext> value) {
		super(value);
	}

	@Override
	public Boolean execute(TContext context) {
		return this.getValue().execute(context) == null;
	}

}
