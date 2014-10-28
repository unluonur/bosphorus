package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class IsNull<TType> extends BaseUnaryCondition<TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3636165189362122163L;

	public IsNull(IExpression<TType> value) {
		super(value);
	}

	@Override
	public Boolean execute(ITuple input) throws Exception {
		return this.getValue().execute(input) == null;
	}

}
