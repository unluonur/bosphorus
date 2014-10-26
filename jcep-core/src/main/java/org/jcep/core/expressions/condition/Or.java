package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class Or<TInput> extends BaseBinaryCondition<TInput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9154941041282771924L;

	public Or(IExpression<TInput, Boolean> left,
			IExpression<TInput, Boolean> right) {
		super(left, right);
	}

	public Boolean execute(TInput input) {
		return this.getLeft().execute(input) || this.getRight().execute(input);
	}

}
