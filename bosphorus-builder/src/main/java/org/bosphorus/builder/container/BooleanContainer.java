package org.bosphorus.builder.container;

import org.bosphorus.core.expression.IExpression;
import org.bosphorus.core.expression.condition.And;
import org.bosphorus.core.expression.condition.Not;
import org.bosphorus.core.expression.condition.Or;

public class BooleanContainer<TInput> extends BaseComparableContainer<TInput, Boolean> {

	public BooleanContainer(IExpression<TInput, Boolean> expression) {
		super(expression);
	}
	
	public BooleanContainer<TInput> and(BooleanContainer<TInput> expression) {
		return new BooleanContainer<TInput>(new And<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanContainer<TInput> and(IExpression<TInput, Boolean> expression) {
		return new BooleanContainer<TInput>(new And<TInput>(this.getExpression(), expression));
	}
	
	public BooleanContainer<TInput> or(BooleanContainer<TInput> expression) {
		return new BooleanContainer<TInput>(new Or<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanContainer<TInput> or(IExpression<TInput, Boolean> expression) {
		return new BooleanContainer<TInput>(new Or<TInput>(this.getExpression(), expression));
	}
	
	public BooleanContainer<TInput> not() {
		return new BooleanContainer<TInput>(new Not<TInput>(this.getExpression()));
	}

}
