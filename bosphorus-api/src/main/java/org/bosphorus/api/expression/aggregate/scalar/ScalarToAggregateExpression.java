package org.bosphorus.api.expression.aggregate.scalar;

import org.bosphorus.api.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.aggregate.factory.scalar.ExpressionFactory;

public class ScalarToAggregateExpression<TInput, TType, TOutput> implements IAggregateExpression<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<TInput, TType> scalarExpression;
	private IAggregateExpression<TType, TOutput> aggregateExpression;
	
	public ScalarToAggregateExpression(IScalarExpression<TInput, TType> scalarExpression, IAggregateExpression<TType, TOutput> aggregateExpression) {
		this.setScalarExpression(scalarExpression);
		this.setAggregateExpression(aggregateExpression);
	}
	
	public IScalarExpression<TInput, TType> getScalarExpression() {
		return scalarExpression;
	}
	
	public void setScalarExpression(IScalarExpression<TInput, TType> scalarExpression) {
		this.scalarExpression = scalarExpression;
	}
	
	public IAggregateExpression<TType, TOutput> getAggregateExpression() {
		return aggregateExpression;
	}
	
	public void setAggregateExpression(IAggregateExpression<TType, TOutput> aggregateExpression) {
		this.aggregateExpression = aggregateExpression;
	}

	@Override
	public IAggregateExecutorFactory<TInput, TOutput> build() {
		return new ExpressionFactory<TInput, TType, TOutput>(this.getScalarExpression().build(), this.getAggregateExpression().build());
	}
	
}
