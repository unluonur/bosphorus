package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.IScalarExecutor;
import org.bosphorus.expression.scalar.condition.And;
import org.bosphorus.expression.scalar.condition.Not;
import org.bosphorus.expression.scalar.condition.Or;

public class BooleanContainer<TInput> extends BaseComparableContainer<TInput, Boolean> {

	public BooleanContainer(IScalarExecutor<TInput, Boolean> expression) {
		super(expression);
	}
	
	public BooleanContainer<TInput> and(BooleanContainer<TInput> expression) {
		return new BooleanContainer<TInput>(new And<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanContainer<TInput> and(IScalarExecutor<TInput, Boolean> expression) {
		return new BooleanContainer<TInput>(new And<TInput>(this.getExpression(), expression));
	}
	
	public BooleanContainer<TInput> or(BooleanContainer<TInput> expression) {
		return new BooleanContainer<TInput>(new Or<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanContainer<TInput> or(IScalarExecutor<TInput, Boolean> expression) {
		return new BooleanContainer<TInput>(new Or<TInput>(this.getExpression(), expression));
	}
	
	public BooleanContainer<TInput> not() {
		return new BooleanContainer<TInput>(new Not<TInput>(this.getExpression()));
	}

}
