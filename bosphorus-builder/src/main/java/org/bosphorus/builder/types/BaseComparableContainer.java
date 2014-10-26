package org.bosphorus.builder.types;

import java.util.ArrayList;

import org.bosphorus.core.expressions.Constant;
import org.bosphorus.core.expressions.IExpression;
import org.bosphorus.core.expressions.condition.Equals;
import org.bosphorus.core.expressions.condition.GreaterThan;
import org.bosphorus.core.expressions.condition.GreaterThanOrEqual;
import org.bosphorus.core.expressions.condition.In;
import org.bosphorus.core.expressions.condition.LessThan;
import org.bosphorus.core.expressions.condition.LessThanOrEqual;
import org.bosphorus.core.expressions.condition.NotEquals;
import org.bosphorus.core.expressions.condition.NotIn;

public abstract class BaseComparableContainer<TInput, TOutput extends Comparable<TOutput>> extends BaseTypeContainer<TInput, TOutput> {
	
	public BaseComparableContainer(IExpression<TInput, TOutput> expression) {
		super(expression);
	}
	
	public BooleanContainer<TInput> isEqualTo(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new Equals<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isEqualTo(TOutput value) {
		return new BooleanContainer<TInput>(new Equals<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isEqualTo(IExpression<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new Equals<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isNotEqualTo(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new NotEquals<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isNotEqualTo(TOutput value) {
		return new BooleanContainer<TInput>(new NotEquals<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isNotEqualTo(IExpression<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new NotEquals<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isLessThan(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new LessThan<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isLessThan(TOutput value) {
		return new BooleanContainer<TInput>(new LessThan<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isLessThan(IExpression<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new LessThan<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isLessThanOrEqualsTo(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new LessThanOrEqual<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isLessThanOrEqualsTo(TOutput value) {
		return new BooleanContainer<TInput>(new LessThanOrEqual<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isLessThanOrEqualsTo(IExpression<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new LessThanOrEqual<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isGreaterThan(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new GreaterThan<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isGreaterThan(TOutput value) {
		return new BooleanContainer<TInput>(new GreaterThan<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isGreaterThan(IExpression<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new GreaterThan<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isGreaterThanOrEqualsTo(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new GreaterThanOrEqual<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isGreaterThanOrEqualsTo(TOutput value) {
		return new BooleanContainer<TInput>(new GreaterThanOrEqual<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isGreaterThanOrEqualsTo(IExpression<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new GreaterThanOrEqual<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isIn(ArrayList<IExpression<TInput, TOutput>> list) {
		return new BooleanContainer<TInput>(new In<TInput, TOutput>(this.getExpression(), list));
	}

	public BooleanContainer<TInput> isInConst(ArrayList<TOutput> list) {
		ArrayList<IExpression<TInput, TOutput>> tmp = new ArrayList<IExpression<TInput, TOutput>>();
		for(TOutput expr: list) {
			tmp.add(new Constant<TInput, TOutput>(expr));
		}
		return new BooleanContainer<TInput>(new In<TInput, TOutput>(this.getExpression(), tmp));
	}

	public BooleanContainer<TInput> isNotIn(ArrayList<IExpression<TInput, TOutput>> list) {
		return new BooleanContainer<TInput>(new NotIn<TInput, TOutput>(this.getExpression(), list));
	}

	public BooleanContainer<TInput> isNotInConst(ArrayList<TOutput> list) {
		ArrayList<IExpression<TInput, TOutput>> tmp = new ArrayList<IExpression<TInput, TOutput>>();
		for(TOutput expr: list) {
			tmp.add(new Constant<TInput, TOutput>(expr));
		}
		return new BooleanContainer<TInput>(new NotIn<TInput, TOutput>(this.getExpression(), tmp));
	}

}
