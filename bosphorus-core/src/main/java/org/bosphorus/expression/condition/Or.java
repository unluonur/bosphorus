package org.bosphorus.expression.condition;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class Or extends BaseBinaryCondition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9154941041282771924L;

	public Or(IExpression<Boolean> left,
			IExpression<Boolean> right) {
		super(left, right);
	}

	public Boolean execute(ITuple input) throws Exception {
		return this.getLeft().execute(input) || this.getRight().execute(input);
	}

}
