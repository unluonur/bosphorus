package org.bosphorus.api.fluent.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.builder.expression.scalar.aggregate.ListAggregateExpression;
import org.bosphorus.api.fluent.expression.scalar.type.BaseTypeExpression;

public abstract class BaseListExpression<TInput, TType> extends BaseTypeExpression<TInput, List<? extends TType>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseListExpression(IScalarExpression<TInput, List<? extends TType>> builder) {
		super(builder);
	}
	
	public <TOutput> IScalarExpression<TInput, TOutput> aggregate(IAggregateExpression<TType, ? extends TOutput> aggregateExpression) {
		return new ListAggregateExpression<TInput, TType, TOutput>(this, aggregateExpression);
	}

}
