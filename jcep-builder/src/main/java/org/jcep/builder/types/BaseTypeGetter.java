package org.jcep.builder.types;

import java.util.ArrayList;
import java.util.Date;

import org.jcep.core.expressions.Constant;
import org.jcep.core.expressions.Convert;
import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.condition.Equals;
import org.jcep.core.expressions.condition.GreaterThan;
import org.jcep.core.expressions.condition.GreaterThanOrEqual;
import org.jcep.core.expressions.condition.In;
import org.jcep.core.expressions.condition.IsNotNull;
import org.jcep.core.expressions.condition.IsNull;
import org.jcep.core.expressions.condition.LessThan;
import org.jcep.core.expressions.condition.LessThanOrEqual;
import org.jcep.core.expressions.condition.NotEquals;
import org.jcep.core.expressions.condition.NotIn;

public abstract class BaseTypeGetter<TType extends Comparable<TType>, TContext> {
	private IExpression<TType, TContext> expression;
	
	public BaseTypeGetter(IExpression<TType, TContext> expression) {
		this.setExpression(expression);
	}

	public IExpression<TType, TContext> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<TType, TContext> expression) {
		this.expression = expression;
	}
	
	public BooleanGetter<TContext> isNull() {
		return new BooleanGetter<TContext>(new IsNull<TType, TContext>(this.getExpression()));
	}
	
	public BooleanGetter<TContext> isNotNull() {
		return new BooleanGetter<TContext>(new IsNotNull<TType, TContext>(this.getExpression()));
	}
	
	public BooleanGetter<TContext> isEqualTo(BaseTypeGetter<TType, TContext> value) {
		return new BooleanGetter<TContext>(new Equals<TType, TContext>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TContext> isEqualTo(TType value) {
		return new BooleanGetter<TContext>(new Equals<TType, TContext>(this.getExpression(), new Constant<TType, TContext>(value)));
	}
	
	public BooleanGetter<TContext> isEqualTo(IExpression<TType, TContext> value) {
		return new BooleanGetter<TContext>(new Equals<TType, TContext>(this.getExpression(), value));
	}
	
	public BooleanGetter<TContext> isNotEqualTo(BaseTypeGetter<TType, TContext> value) {
		return new BooleanGetter<TContext>(new NotEquals<TType, TContext>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TContext> isNotEqualTo(TType value) {
		return new BooleanGetter<TContext>(new NotEquals<TType, TContext>(this.getExpression(), new Constant<TType, TContext>(value)));
	}
	
	public BooleanGetter<TContext> isNotEqualTo(IExpression<TType, TContext> value) {
		return new BooleanGetter<TContext>(new NotEquals<TType, TContext>(this.getExpression(), value));
	}
	
	public BooleanGetter<TContext> isLessThan(BaseTypeGetter<TType, TContext> value) {
		return new BooleanGetter<TContext>(new LessThan<TType, TContext>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TContext> isLessThan(TType value) {
		return new BooleanGetter<TContext>(new LessThan<TType, TContext>(this.getExpression(), new Constant<TType, TContext>(value)));
	}
	
	public BooleanGetter<TContext> isLessThan(IExpression<TType, TContext> value) {
		return new BooleanGetter<TContext>(new LessThan<TType, TContext>(this.getExpression(), value));
	}
	
	public BooleanGetter<TContext> isLessThanOrEqualsTo(BaseTypeGetter<TType, TContext> value) {
		return new BooleanGetter<TContext>(new LessThanOrEqual<TType, TContext>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TContext> isLessThanOrEqualsTo(TType value) {
		return new BooleanGetter<TContext>(new LessThanOrEqual<TType, TContext>(this.getExpression(), new Constant<TType, TContext>(value)));
	}
	
	public BooleanGetter<TContext> isLessThanOrEqualsTo(IExpression<TType, TContext> value) {
		return new BooleanGetter<TContext>(new LessThanOrEqual<TType, TContext>(this.getExpression(), value));
	}
	
	public BooleanGetter<TContext> isGreaterThan(BaseTypeGetter<TType, TContext> value) {
		return new BooleanGetter<TContext>(new GreaterThan<TType, TContext>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TContext> isGreaterThan(TType value) {
		return new BooleanGetter<TContext>(new GreaterThan<TType, TContext>(this.getExpression(), new Constant<TType, TContext>(value)));
	}
	
	public BooleanGetter<TContext> isGreaterThan(IExpression<TType, TContext> value) {
		return new BooleanGetter<TContext>(new GreaterThan<TType, TContext>(this.getExpression(), value));
	}
	
	public BooleanGetter<TContext> isGreaterThanOrEqualsTo(BaseTypeGetter<TType, TContext> value) {
		return new BooleanGetter<TContext>(new GreaterThanOrEqual<TType, TContext>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TContext> isGreaterThanOrEqualsTo(TType value) {
		return new BooleanGetter<TContext>(new GreaterThanOrEqual<TType, TContext>(this.getExpression(), new Constant<TType, TContext>(value)));
	}
	
	public BooleanGetter<TContext> isGreaterThanOrEqualsTo(IExpression<TType, TContext> value) {
		return new BooleanGetter<TContext>(new GreaterThanOrEqual<TType, TContext>(this.getExpression(), value));
	}
	
	public BooleanGetter<TContext> isIn(ArrayList<IExpression<TType, TContext>> list) {
		return new BooleanGetter<TContext>(new In<TType, TContext>(this.getExpression(), list));
	}

	public BooleanGetter<TContext> isInConst(ArrayList<TType> list) {
		ArrayList<IExpression<TType, TContext>> tmp = new ArrayList<IExpression<TType,TContext>>();
		for(TType expr: list) {
			tmp.add(new Constant<TType, TContext>(expr));
		}
		return new BooleanGetter<TContext>(new In<TType, TContext>(this.getExpression(), tmp));
	}

	public BooleanGetter<TContext> isNotIn(ArrayList<IExpression<TType, TContext>> list) {
		return new BooleanGetter<TContext>(new NotIn<TType, TContext>(this.getExpression(), list));
	}

	public BooleanGetter<TContext> isNotInConst(ArrayList<TType> list) {
		ArrayList<IExpression<TType, TContext>> tmp = new ArrayList<IExpression<TType,TContext>>();
		for(TType expr: list) {
			tmp.add(new Constant<TType, TContext>(expr));
		}
		return new BooleanGetter<TContext>(new NotIn<TType, TContext>(this.getExpression(), tmp));
	}
	
	public BooleanGetter<TContext> convertToBoolean() {
		return new BooleanGetter<TContext>(new Convert<TType, Boolean, TContext>(this.getExpression()));
	}
	
	public DateGetter<TContext> convertToDate() {
		return new DateGetter<TContext>(new Convert<TType, Date, TContext>(this.getExpression()));
	}
	
	public DoubleGetter<TContext> convertToDouble() {
		return new DoubleGetter<TContext>(new Convert<TType, Double, TContext>(this.getExpression()));
	}
	
	public FloatGetter<TContext> convertToFloat() {
		return new FloatGetter<TContext>(new Convert<TType, Float, TContext>(this.getExpression()));
	}
	
	public IntegerGetter<TContext> convertToInteger() {
		return new IntegerGetter<TContext>(new Convert<TType, Integer, TContext>(this.getExpression()));
	}
	
	public LongGetter<TContext> convertToLong() {
		return new LongGetter<TContext>(new Convert<TType, Long, TContext>(this.getExpression()));
	}
	
	public StringGetter<TContext> convertToString() {
		return new StringGetter<TContext>(new Convert<TType, String, TContext>(this.getExpression()));
	}
}
