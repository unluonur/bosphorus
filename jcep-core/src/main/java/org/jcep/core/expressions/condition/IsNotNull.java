package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class IsNotNull<TType, TContext> extends BaseUnaryCondition<TType, TContext> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4900316036835479432L;

	public IsNotNull(IExpression<TType, TContext> value) {
		super(value);
	}

	@Override
	public Boolean execute(TContext context) {
		return this.getValue().execute(context) != null;
	}

}
