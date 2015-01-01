package org.bosphorus.api.fluent.expression.aggregate;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;

public class IntegerAggregateExpression<TInput> extends BaseAggregateExpression<TInput, Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerAggregateExpression(
			IAggregateExpression<TInput, Integer> builder) {
		super(builder);
	}

}
