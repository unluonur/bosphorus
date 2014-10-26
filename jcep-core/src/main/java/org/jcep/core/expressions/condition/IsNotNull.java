package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class IsNotNull<TInput, TOutput> extends BaseUnaryCondition<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4900316036835479432L;

	public IsNotNull(IExpression<TInput, TOutput> value) {
		super(value);
	}

	@Override
	public Boolean execute(TInput input) {
		return this.getValue().execute(input) != null;
	}

}
