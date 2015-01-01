package org.bosphorus.api.fluent.expression.aggregate;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class BaseAggregateExpression<TInput, TOutput> implements IAggregateExpression<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IAggregateExpression<TInput, TOutput> builder;
	
	public BaseAggregateExpression(IAggregateExpression<TInput, TOutput> builder) {
		this.setBuilder(builder);
	}

	public IAggregateExpression<TInput, TOutput> getBuilder() {
		return builder;
	}

	public void setBuilder(IAggregateExpression<TInput, TOutput> builder) {
		this.builder = builder;
	}
	
	@Override
	public IAggregateExecutorFactory<TInput, TOutput> build() {
		return getBuilder().build();
	}

}
