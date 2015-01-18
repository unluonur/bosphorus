package org.bosphorus.api.builder.expression.scalar.common;

import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.core.expression.scalar.factory.common.ListAggregateExecutorFactory;

public class ListAggregateExpression<TInput, TType, TOutput> implements IScalarExpression1<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression1<TInput, ? extends List<? extends TType>> scalarExpression;
	private IAggregateExpression<TType, TOutput> aggregateExpression;
	
	public ListAggregateExpression(
			IScalarExpression1<TInput, ? extends List<? extends TType>> scalarExpression, 
			IAggregateExpression<TType, TOutput> aggregateExpression) {
		this.setScalarExpression(scalarExpression);
		this.setAggregateExpression(aggregateExpression);
	}

	public IScalarExpression1<TInput, ? extends List<? extends TType>> getScalarExpression() {
		return scalarExpression;
	}

	public void setScalarExpression(IScalarExpression1<TInput, ? extends List<? extends TType>> scalarExpression) {
		this.scalarExpression = scalarExpression;
	}

	public IAggregateExpression<TType, ? extends TOutput> getAggregateExpression() {
		return aggregateExpression;
	}

	public void setAggregateExpression(IAggregateExpression<TType, TOutput> aggregateExpression) {
		this.aggregateExpression = aggregateExpression;
	}

	@Override
	public IScalarExecutorFactory1<TInput, TOutput> build() {
		return new ListAggregateExecutorFactory<TInput, TType, TOutput>(getScalarExpression().build(), getAggregateExpression().build());
	}

}
