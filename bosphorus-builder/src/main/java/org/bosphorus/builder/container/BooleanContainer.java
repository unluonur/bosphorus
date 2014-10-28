package org.bosphorus.builder.container;

import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.condition.And;
import org.bosphorus.expression.condition.Not;
import org.bosphorus.expression.condition.Or;

public class BooleanContainer extends BaseComparableContainer<Boolean> {

	public BooleanContainer(IExpression<Boolean> expression) {
		super(expression);
	}
	
	public BooleanContainer and(BooleanContainer expression) {
		return new BooleanContainer(new And(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanContainer and(IExpression<Boolean> expression) {
		return new BooleanContainer(new And(this.getExpression(), expression));
	}
	
	public BooleanContainer or(BooleanContainer expression) {
		return new BooleanContainer(new Or(this.getExpression(), expression.getExpression()));
	}
	
	public BooleanContainer or(IExpression<Boolean> expression) {
		return new BooleanContainer(new Or(this.getExpression(), expression));
	}
	
	public BooleanContainer not() {
		return new BooleanContainer(new Not(this.getExpression()));
	}

}
