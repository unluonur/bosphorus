package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class And<TInput> extends BaseBinaryCondition<TInput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7195735974895210091L;

	public And(IExpression<TInput, Boolean> left,
			IExpression<TInput, Boolean> right) {
		super(left, right);
	}

	public Boolean execute(TInput input) {
		return this.getLeft().execute(input) && this.getRight().execute(input);
	}

}
