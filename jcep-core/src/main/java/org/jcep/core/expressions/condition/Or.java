package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class Or<TContext> extends BaseBinaryCondition<TContext> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9154941041282771924L;

	public Or(IExpression<Boolean, TContext> left,
			IExpression<Boolean, TContext> right) {
		super(left, right);
	}

	public Boolean execute(TContext context) {
		return this.getLeft().execute(context) || this.getRight().execute(context);
	}

}
