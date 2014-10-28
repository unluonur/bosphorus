package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class IsNotNull<TType> extends BaseUnaryCondition<TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4900316036835479432L;

	public IsNotNull(IExpression<TType> value) {
		super(value);
	}

	@Override
	public Boolean execute(ITuple input) throws Exception {
		return this.getValue().execute(input) != null;
	}

}
