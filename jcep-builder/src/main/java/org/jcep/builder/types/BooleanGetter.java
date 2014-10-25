package org.jcep.builder.types;

import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.condition.And;
import org.jcep.core.expressions.condition.Not;
import org.jcep.core.expressions.condition.Or;

public class BooleanGetter<TContext> extends BaseTypeGetter<Boolean, TContext> {

	public BooleanGetter(IExpression<Boolean, TContext> expression) {
		super(expression);
	}
	
	public BooleanGetter<TContext> and(BooleanGetter<TContext> expression) {
		return new BooleanGetter<TContext>(new And<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanGetter<TContext> and(IExpression<Boolean, TContext> expression) {
		return new BooleanGetter<TContext>(new And<TContext>(this.getExpression(), expression));
	}
	
	public BooleanGetter<TContext> or(BooleanGetter<TContext> expression) {
		return new BooleanGetter<TContext>(new Or<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanGetter<TContext> or(IExpression<Boolean, TContext> expression) {
		return new BooleanGetter<TContext>(new Or<TContext>(this.getExpression(), expression));
	}
	
	public BooleanGetter<TContext> not() {
		return new BooleanGetter<TContext>(new Not<TContext>(this.getExpression()));
	}

}
