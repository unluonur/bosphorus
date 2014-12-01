package org.bosphorus.api.builder.expression.scalar.aggregate;

import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.aggregate.ListAggregateExecutor;

public class ListAggregateExpression<TInput, TType, TOutput> implements IScalarExpression<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<TInput, List<? extends TType>> scalarExpression;
	private IAggregateExpression<TType, ? extends TOutput> aggregateExpression;
	
	public ListAggregateExpression(IScalarExpression<TInput, List<? extends TType>> scalarExpression, IAggregateExpression<TType, ? extends TOutput> aggregateExpression) {
		this.setScalarExpression(scalarExpression);
		this.setAggregateExpression(aggregateExpression);
	}

	public IScalarExpression<TInput, List<? extends TType>> getScalarExpression() {
		return scalarExpression;
	}

	public void setScalarExpression(IScalarExpression<TInput, List<? extends TType>> scalarExpression) {
		this.scalarExpression = scalarExpression;
	}

	public IAggregateExpression<TType, ? extends TOutput> getAggregateExpression() {
		return aggregateExpression;
	}

	public void setAggregateExpression(IAggregateExpression<TType, ? extends TOutput> aggregateExpression) {
		this.aggregateExpression = aggregateExpression;
	}

	@Override
	public IScalarExecutor<TInput, TOutput> build() {
		return new ListAggregateExecutor<TInput, TType, TOutput>(getScalarExpression().build(), getAggregateExpression().build());
	}

}
