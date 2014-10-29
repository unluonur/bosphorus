package org.bosphorus.expression.condition;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class And extends BaseBinaryCondition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7195735974895210091L;

	public And(IExpression<Boolean> left,
			IExpression<Boolean> right) {
		super(left, right);
	}

	public Boolean execute(ITuple input) throws Exception {
		return this.getLeft().execute(input) && this.getRight().execute(input);
	}

}
