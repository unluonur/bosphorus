package org.bosphorus.expression.condition;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class Or<TInput> extends BaseBinaryCondition<TInput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9154941041282771924L;

	public Or(IExpression<TInput, Boolean> left,
			IExpression<TInput, Boolean> right) {
		super(left, right);
	}

	public Boolean execute(TInput input) throws Exception {
		return this.getLeft().execute(input) || this.getRight().execute(input);
	}

}
