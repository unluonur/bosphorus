package org.bosphorus.api.fluent.expression.scalar.list;

import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.builder.expression.scalar.aggregate.ListAggregateExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor1;

public abstract class BaseListExpression<TInput, TType> implements IScalarExpression1<TInput, List<TType>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression1<TInput, ? extends List<? extends TType>> builder;

	public BaseListExpression(IScalarExpression1<TInput, ? extends List<? extends TType>> builder) {
		this.setBuilder(builder);
	}
	
	public IScalarExpression1<TInput, ? extends List<? extends TType>> getBuilder() {
		return builder;
	}

	public void setBuilder(IScalarExpression1<TInput, ? extends List<? extends TType>> builder) {
		this.builder = builder;
	}
	
	public <TOutput> IScalarExpression1<TInput, TOutput> aggregate(IAggregateExpression<TType, TOutput> aggregateExpression) {
		return new ListAggregateExpression<TInput, TType, TOutput>(this, aggregateExpression);
	}

	@SuppressWarnings("unchecked")
	@Override
	public IScalarExecutor1<TInput, List<TType>> build() {
		return (IScalarExecutor1<TInput, List<TType>>) this.getBuilder().build();
	}

}
