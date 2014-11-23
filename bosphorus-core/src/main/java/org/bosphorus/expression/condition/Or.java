package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;

public class Or<TInput> extends BaseBinaryCondition<TInput> {

	public Or(IExpression<TInput, Boolean> left,
			IExpression<TInput, Boolean> right) {
		super(left, right);
	}

	public Boolean execute(TInput input) throws Exception {
		return this.getLeft().execute(input) || this.getRight().execute(input);
	}

}
