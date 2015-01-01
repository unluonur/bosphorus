package org.bosphorus.api.fluent.expression.aggregate;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;

public class ObjectAggregateExpression<TInput> extends BaseAggregateExpression<TInput, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ObjectAggregateExpression(
			IAggregateExpression<TInput, Object> builder) {
		super(builder);
	}

}
