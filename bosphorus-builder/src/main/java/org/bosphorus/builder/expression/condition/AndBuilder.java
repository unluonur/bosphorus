package org.bosphorus.builder.expression.condition;

import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.condition.And;

public class AndBuilder<TInput> extends BaseConditionListBuilder<TInput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String getOperator() {
		return "and";
	}

	@Override
	protected IExpression<TInput, Boolean> build(
			IExpression<TInput, Boolean> left,
			IExpression<TInput, Boolean> right) {
		return new And<TInput>(left, right);
	}

}
