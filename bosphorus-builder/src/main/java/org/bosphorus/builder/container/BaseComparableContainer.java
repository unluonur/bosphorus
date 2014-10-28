package org.bosphorus.builder.container;

import java.util.ArrayList;

import org.bosphorus.expression.Constant;
import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.condition.Equals;
import org.bosphorus.expression.condition.GreaterThan;
import org.bosphorus.expression.condition.GreaterThanOrEqual;
import org.bosphorus.expression.condition.In;
import org.bosphorus.expression.condition.LessThan;
import org.bosphorus.expression.condition.LessThanOrEqual;
import org.bosphorus.expression.condition.NotEquals;
import org.bosphorus.expression.condition.NotIn;

public abstract class BaseComparableContainer<TOutput extends Comparable<TOutput>> extends BaseTypeContainer<TOutput> {
	
	public BaseComparableContainer(IExpression<TOutput> expression) {
		super(expression);
	}
	
	public BooleanContainer isEqualTo(BaseComparableContainer<TOutput> value) {
		return new BooleanContainer(new Equals<TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer isEqualTo(TOutput value) {
		return new BooleanContainer(new Equals<TOutput>(this.getExpression(), new Constant<TOutput>(value)));
	}
	
	public BooleanContainer isEqualTo(IExpression<TOutput> value) {
		return new BooleanContainer(new Equals<TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer isNotEqualTo(BaseComparableContainer<TOutput> value) {
		return new BooleanContainer(new NotEquals<TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer isNotEqualTo(TOutput value) {
		return new BooleanContainer(new NotEquals<TOutput>(this.getExpression(), new Constant<TOutput>(value)));
	}
	
	public BooleanContainer isNotEqualTo(IExpression<TOutput> value) {
		return new BooleanContainer(new NotEquals<TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer isLessThan(BaseComparableContainer<TOutput> value) {
		return new BooleanContainer(new LessThan<TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer isLessThan(TOutput value) {
		return new BooleanContainer(new LessThan<TOutput>(this.getExpression(), new Constant<TOutput>(value)));
	}
	
	public BooleanContainer isLessThan(IExpression<TOutput> value) {
		return new BooleanContainer(new LessThan<TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer isLessThanOrEqualsTo(BaseComparableContainer<TOutput> value) {
		return new BooleanContainer(new LessThanOrEqual<TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer isLessThanOrEqualsTo(TOutput value) {
		return new BooleanContainer(new LessThanOrEqual<TOutput>(this.getExpression(), new Constant<TOutput>(value)));
	}
	
	public BooleanContainer isLessThanOrEqualsTo(IExpression<TOutput> value) {
		return new BooleanContainer(new LessThanOrEqual<TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer isGreaterThan(BaseComparableContainer<TOutput> value) {
		return new BooleanContainer(new GreaterThan<TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer isGreaterThan(TOutput value) {
		return new BooleanContainer(new GreaterThan<TOutput>(this.getExpression(), new Constant<TOutput>(value)));
	}
	
	public BooleanContainer isGreaterThan(IExpression<TOutput> value) {
		return new BooleanContainer(new GreaterThan<TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer isGreaterThanOrEqualsTo(BaseComparableContainer<TOutput> value) {
		return new BooleanContainer(new GreaterThanOrEqual<TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer isGreaterThanOrEqualsTo(TOutput value) {
		return new BooleanContainer(new GreaterThanOrEqual<TOutput>(this.getExpression(), new Constant<TOutput>(value)));
	}
	
	public BooleanContainer isGreaterThanOrEqualsTo(IExpression<TOutput> value) {
		return new BooleanContainer(new GreaterThanOrEqual<TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer isIn(ArrayList<IExpression<TOutput>> list) {
		return new BooleanContainer(new In<TOutput>(this.getExpression(), list));
	}

	public BooleanContainer isInConst(ArrayList<TOutput> list) {
		ArrayList<IExpression<TOutput>> tmp = new ArrayList<IExpression<TOutput>>();
		for(TOutput expr: list) {
			tmp.add(new Constant<TOutput>(expr));
		}
		return new BooleanContainer(new In<TOutput>(this.getExpression(), tmp));
	}

	public BooleanContainer isNotIn(ArrayList<IExpression<TOutput>> list) {
		return new BooleanContainer(new NotIn<TOutput>(this.getExpression(), list));
	}

	public BooleanContainer isNotInConst(ArrayList<TOutput> list) {
		ArrayList<IExpression<TOutput>> tmp = new ArrayList<IExpression<TOutput>>();
		for(TOutput expr: list) {
			tmp.add(new Constant<TOutput>(expr));
		}
		return new BooleanContainer(new NotIn<TOutput>(this.getExpression(), tmp));
	}

}
