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

public abstract class BaseTypeGetter<TInput, TOutput extends Comparable<TOutput>> implements ITypeGetter<TInput, TOutput> {
	private IExpression<TInput, TOutput> expression;
	
	public BaseTypeGetter(IExpression<TInput, TOutput> expression) {
		this.setExpression(expression);
	}

	@Override
	public IExpression<TInput, TOutput> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<TInput, TOutput> expression) {
		this.expression = expression;
	}
	
	public BooleanGetter<TInput> isNull() {
		return new BooleanGetter<TInput>(new IsNull<TInput, TOutput>(this.getExpression()));
	}
	
	public BooleanGetter<TInput> isNotNull() {
		return new BooleanGetter<TInput>(new IsNotNull<TInput, TOutput>(this.getExpression()));
	}
	
	public BooleanGetter<TInput> isEqualTo(BaseTypeGetter<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new Equals<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TInput> isEqualTo(TOutput value) {
		return new BooleanGetter<TInput>(new Equals<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanGetter<TInput> isEqualTo(IExpression<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new Equals<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanGetter<TInput> isNotEqualTo(BaseTypeGetter<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new NotEquals<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TInput> isNotEqualTo(TOutput value) {
		return new BooleanGetter<TInput>(new NotEquals<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanGetter<TInput> isNotEqualTo(IExpression<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new NotEquals<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanGetter<TInput> isLessThan(BaseTypeGetter<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new LessThan<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TInput> isLessThan(TOutput value) {
		return new BooleanGetter<TInput>(new LessThan<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanGetter<TInput> isLessThan(IExpression<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new LessThan<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanGetter<TInput> isLessThanOrEqualsTo(BaseTypeGetter<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new LessThanOrEqual<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TInput> isLessThanOrEqualsTo(TOutput value) {
		return new BooleanGetter<TInput>(new LessThanOrEqual<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanGetter<TInput> isLessThanOrEqualsTo(IExpression<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new LessThanOrEqual<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanGetter<TInput> isGreaterThan(BaseTypeGetter<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new GreaterThan<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TInput> isGreaterThan(TOutput value) {
		return new BooleanGetter<TInput>(new GreaterThan<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanGetter<TInput> isGreaterThan(IExpression<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new GreaterThan<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanGetter<TInput> isGreaterThanOrEqualsTo(BaseTypeGetter<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new GreaterThanOrEqual<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanGetter<TInput> isGreaterThanOrEqualsTo(TOutput value) {
		return new BooleanGetter<TInput>(new GreaterThanOrEqual<TInput, TOutput>(this.getExpression(), new Constant<TInput, TOutput>(value)));
	}
	
	public BooleanGetter<TInput> isGreaterThanOrEqualsTo(IExpression<TInput, TOutput> value) {
		return new BooleanGetter<TInput>(new GreaterThanOrEqual<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanGetter<TInput> isIn(ArrayList<IExpression<TInput, TOutput>> list) {
		return new BooleanGetter<TInput>(new In<TInput, TOutput>(this.getExpression(), list));
	}

	public BooleanGetter<TInput> isInConst(ArrayList<TOutput> list) {
		ArrayList<IExpression<TInput, TOutput>> tmp = new ArrayList<IExpression<TInput, TOutput>>();
		for(TOutput expr: list) {
			tmp.add(new Constant<TInput, TOutput>(expr));
		}
		return new BooleanGetter<TInput>(new In<TInput, TOutput>(this.getExpression(), tmp));
	}

	public BooleanGetter<TInput> isNotIn(ArrayList<IExpression<TInput, TOutput>> list) {
		return new BooleanGetter<TInput>(new NotIn<TInput, TOutput>(this.getExpression(), list));
	}

	public BooleanGetter<TInput> isNotInConst(ArrayList<TOutput> list) {
		ArrayList<IExpression<TInput, TOutput>> tmp = new ArrayList<IExpression<TInput, TOutput>>();
		for(TOutput expr: list) {
			tmp.add(new Constant<TInput, TOutput>(expr));
		}
		return new BooleanGetter<TInput>(new NotIn<TInput, TOutput>(this.getExpression(), tmp));
	}
	
	public BooleanGetter<TInput> convertToBoolean() {
		return new BooleanGetter<TInput>(new Convert<TInput, Boolean, TOutput>(this.getExpression()));
	}
	
	public DateGetter<TInput> convertToDate() {
		return new DateGetter<TInput>(new Convert<TInput, Date, TOutput>(this.getExpression()));
	}
	
	public DoubleGetter<TInput> convertToDouble() {
		return new DoubleGetter<TInput>(new Convert<TInput, Double, TOutput>(this.getExpression()));
	}
	
	public FloatGetter<TInput> convertToFloat() {
		return new FloatGetter<TInput>(new Convert<TInput, Float, TOutput>(this.getExpression()));
	}
	
	public IntegerGetter<TInput> convertToInteger() {
		return new IntegerGetter<TInput>(new Convert<TInput, Integer, TOutput>(this.getExpression()));
	}
	
	public LongGetter<TInput> convertToLong() {
		return new LongGetter<TInput>(new Convert<TInput, Long, TOutput>(this.getExpression()));
	}
	
	public StringGetter<TInput> convertToString() {
		return new StringGetter<TInput>(new Convert<TInput, String, TOutput>(this.getExpression()));
	}
}
