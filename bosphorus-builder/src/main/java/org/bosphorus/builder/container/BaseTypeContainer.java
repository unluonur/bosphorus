package org.bosphorus.builder.container;

import java.util.Date;

import org.bosphorus.expression.Convert;
import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.condition.IsNotNull;
import org.bosphorus.expression.condition.IsNull;

public abstract class BaseTypeContainer<TOutput> implements ITypeContainer<TOutput> {
	private IExpression<TOutput> expression;
	
	public BaseTypeContainer(IExpression<TOutput> expression) {
		this.setExpression(expression);
	}

	@Override
	public IExpression<TOutput> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<TOutput> expression) {
		this.expression = expression;
	}
	
	public BooleanContainer isNull() {
		return new BooleanContainer(new IsNull<TOutput>(this.getExpression()));
	}
	
	public BooleanContainer isNotNull() {
		return new BooleanContainer(new IsNotNull<TOutput>(this.getExpression()));
	}
	
	public BooleanContainer convertToBoolean() {
		return new BooleanContainer(new Convert<Boolean, TOutput>(this.getExpression()));
	}
	
	public DateContainer convertToDate() {
		return new DateContainer(new Convert<Date, TOutput>(this.getExpression()));
	}
	
	public DoubleContainer convertToDouble() {
		return new DoubleContainer(new Convert<Double, TOutput>(this.getExpression()));
	}
	
	public FloatContainer convertToFloat() {
		return new FloatContainer(new Convert<Float, TOutput>(this.getExpression()));
	}
	
	public IntegerContainer convertToInteger() {
		return new IntegerContainer(new Convert<Integer, TOutput>(this.getExpression()));
	}
	
	public LongContainer convertToLong() {
		return new LongContainer(new Convert<Long, TOutput>(this.getExpression()));
	}
	
	public StringContainer convertToString() {
		return new StringContainer(new Convert<String, TOutput>(this.getExpression()));
	}
}
