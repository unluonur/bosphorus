package org.bosphorus.api.fluent.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.builder.expression.scalar.aggregate.ListAggregateExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public abstract class BaseListExpression<TInput, TType> implements IScalarExpression<TInput, List<TType>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<TInput, ? extends List<? extends TType>> builder;

	public BaseListExpression(IScalarExpression<TInput, ? extends List<? extends TType>> builder) {
		this.setBuilder(builder);
	}
	
	public IScalarExpression<TInput, ? extends List<? extends TType>> getBuilder() {
		return builder;
	}

	public void setBuilder(IScalarExpression<TInput, ? extends List<? extends TType>> builder) {
		this.builder = builder;
	}
	
	public <TOutput> IScalarExpression<TInput, TOutput> aggregate(IAggregateExpression<TType, TOutput> aggregateExpression) {
		return new ListAggregateExpression<TInput, TType, TOutput>(this, aggregateExpression);
	}

	@SuppressWarnings("unchecked")
	@Override
	public IScalarExecutor<TInput, List<TType>> build() {
		return (IScalarExecutor<TInput, List<TType>>) this.getBuilder().build();
	}

}
