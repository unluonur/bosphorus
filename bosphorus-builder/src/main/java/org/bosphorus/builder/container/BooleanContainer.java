package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.condition.AndExecutor;
import org.bosphorus.expression.scalar.executor.condition.NotExecutor;
import org.bosphorus.expression.scalar.executor.condition.OrExecutor;

public class BooleanContainer<TInput> extends BaseComparableContainer<TInput, Boolean> {

	public BooleanContainer(IScalarExecutor<TInput, Boolean> expression) {
		super(expression);
	}
	
	public BooleanContainer<TInput> and(BooleanContainer<TInput> expression) {
		return new BooleanContainer<TInput>(new AndExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanContainer<TInput> and(IScalarExecutor<TInput, Boolean> expression) {
		return new BooleanContainer<TInput>(new AndExecutor<TInput>(this.getExpression(), expression));
	}
	
	public BooleanContainer<TInput> or(BooleanContainer<TInput> expression) {
		return new BooleanContainer<TInput>(new OrExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanContainer<TInput> or(IScalarExecutor<TInput, Boolean> expression) {
		return new BooleanContainer<TInput>(new OrExecutor<TInput>(this.getExpression(), expression));
	}
	
	public BooleanContainer<TInput> not() {
		return new BooleanContainer<TInput>(new NotExecutor<TInput>(this.getExpression()));
	}

}
