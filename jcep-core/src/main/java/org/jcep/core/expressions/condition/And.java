package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class And<TContext> extends BaseBinaryCondition<TContext> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7195735974895210091L;

	public And(IExpression<Boolean, TContext> left,
			IExpression<Boolean, TContext> right) {
		super(left, right);
	}

	public Boolean execute(TContext context) {
		return this.getLeft().execute(context) && this.getRight().execute(context);
	}

}
