package org.jcep.builder.types;

import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.condition.And;
import org.jcep.core.expressions.condition.Not;
import org.jcep.core.expressions.condition.Or;

public class BooleanGetter<TInput> extends BaseTypeGetter<TInput, Boolean> {

	public BooleanGetter(IExpression<TInput, Boolean> expression) {
		super(expression);
	}
	
	public BooleanGetter<TInput> and(BooleanGetter<TInput> expression) {
		return new BooleanGetter<TInput>(new And<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanGetter<TInput> and(IExpression<TInput, Boolean> expression) {
		return new BooleanGetter<TInput>(new And<TInput>(this.getExpression(), expression));
	}
	
	public BooleanGetter<TInput> or(BooleanGetter<TInput> expression) {
		return new BooleanGetter<TInput>(new Or<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanGetter<TInput> or(IExpression<TInput, Boolean> expression) {
		return new BooleanGetter<TInput>(new Or<TInput>(this.getExpression(), expression));
	}
	
	public BooleanGetter<TInput> not() {
		return new BooleanGetter<TInput>(new Not<TInput>(this.getExpression()));
	}

}
