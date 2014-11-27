package org.bosphorus.builder.expression.condition;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.condition.Or;

public class OrBuilder<TInput> extends BaseConditionListBuilder<TInput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String getOperator() {
		return "or";
	}

	@Override
	protected IScalarExecutor<TInput, Boolean> build(
			IScalarExecutor<TInput, Boolean> left,
			IScalarExecutor<TInput, Boolean> right) {
		return new Or<TInput>(left, right);
	}

}
