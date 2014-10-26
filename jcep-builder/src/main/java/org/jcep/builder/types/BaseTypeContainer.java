package org.jcep.builder.types;

import java.util.Date;
import org.jcep.core.expressions.Convert;
import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.condition.IsNotNull;
import org.jcep.core.expressions.condition.IsNull;

public abstract class BaseTypeContainer<TInput, TOutput> implements ITypeContainer<TInput, TOutput> {
	private IExpression<TInput, TOutput> expression;
	
	public BaseTypeContainer(IExpression<TInput, TOutput> expression) {
		this.setExpression(expression);
	}

	@Override
	public IExpression<TInput, TOutput> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<TInput, TOutput> expression) {
		this.expression = expression;
	}
	
	public BooleanContainer<TInput> isNull() {
		return new BooleanContainer<TInput>(new IsNull<TInput, TOutput>(this.getExpression()));
	}
	
	public BooleanContainer<TInput> isNotNull() {
		return new BooleanContainer<TInput>(new IsNotNull<TInput, TOutput>(this.getExpression()));
	}
	
	public BooleanContainer<TInput> convertToBoolean() {
		return new BooleanContainer<TInput>(new Convert<TInput, Boolean, TOutput>(this.getExpression()));
	}
	
	public DateContainer<TInput> convertToDate() {
		return new DateContainer<TInput>(new Convert<TInput, Date, TOutput>(this.getExpression()));
	}
	
	public DoubleContainer<TInput> convertToDouble() {
		return new DoubleContainer<TInput>(new Convert<TInput, Double, TOutput>(this.getExpression()));
	}
	
	public FloatContainer<TInput> convertToFloat() {
		return new FloatContainer<TInput>(new Convert<TInput, Float, TOutput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> convertToInteger() {
		return new IntegerContainer<TInput>(new Convert<TInput, Integer, TOutput>(this.getExpression()));
	}
	
	public LongContainer<TInput> convertToLong() {
		return new LongContainer<TInput>(new Convert<TInput, Long, TOutput>(this.getExpression()));
	}
	
	public StringContainer<TInput> convertToString() {
		return new StringContainer<TInput>(new Convert<TInput, String, TOutput>(this.getExpression()));
	}
}
