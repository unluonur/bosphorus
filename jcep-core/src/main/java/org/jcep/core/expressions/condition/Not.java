package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.common.IExpression;

public class Not<TContext> extends BaseUnaryCondition<Boolean, TContext> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2303076151421970778L;

	public Not(IExpression<Boolean, TContext> value) {
		super(value);
	}

	@Override
	public Boolean execute(TContext context) {
		return !this.getValue().execute(context);
	}

}
