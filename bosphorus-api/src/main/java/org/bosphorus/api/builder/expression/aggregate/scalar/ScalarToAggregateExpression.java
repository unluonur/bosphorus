package org.bosphorus.api.builder.expression.aggregate.scalar;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.aggregate.factory.scalar.ExpressionFactory;

public class ScalarToAggregateExpression<TInput, TType, TOutput> implements IAggregateExpression<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression1<TInput, ? extends TType> scalarExpression;
	private IAggregateExpression<TType, TOutput> aggregateExpression;
	
	public ScalarToAggregateExpression(IScalarExpression1<TInput, ? extends TType> scalarExpression, IAggregateExpression<TType, TOutput> aggregateExpression) {
		this.setScalarExpression(scalarExpression);
		this.setAggregateExpression(aggregateExpression);
	}
	
	public IScalarExpression1<TInput, ? extends TType> getScalarExpression() {
		return scalarExpression;
	}
	
	public void setScalarExpression(IScalarExpression1<TInput, ? extends TType> scalarExpression) {
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
		return new ExpressionFactory<TInput, TType, TOutput>(this.getScalarExpression().build().create(), this.getAggregateExpression().build());
	}

}
