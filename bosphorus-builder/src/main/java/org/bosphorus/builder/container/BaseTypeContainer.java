package org.bosphorus.builder.container;

import java.util.Date;

import org.bosphorus.expression.scalar.ConvertExecutor;
import org.bosphorus.expression.scalar.IScalarExecutor;
import org.bosphorus.expression.scalar.condition.IsNotNull;
import org.bosphorus.expression.scalar.condition.IsNull;

public abstract class BaseTypeContainer<TInput, TOutput> implements ITypeContainer<TInput, TOutput> {
	private IScalarExecutor<TInput, TOutput> expression;
	
	public BaseTypeContainer(IScalarExecutor<TInput, TOutput> expression) {
		this.setExpression(expression);
	}

	@Override
	public IScalarExecutor<TInput, TOutput> getExpression() {
		return expression;
	}

	public void setExpression(IScalarExecutor<TInput, TOutput> expression) {
		this.expression = expression;
	}
	
	public BooleanContainer<TInput> isNull() {
		return new BooleanContainer<TInput>(new IsNull<TInput, TOutput>(this.getExpression()));
	}
	
	public BooleanContainer<TInput> isNotNull() {
		return new BooleanContainer<TInput>(new IsNotNull<TInput, TOutput>(this.getExpression()));
	}
	
	public BooleanContainer<TInput> convertToBoolean() {
		return new BooleanContainer<TInput>(new ConvertExecutor<TInput, Boolean, TOutput>(this.getExpression()));
	}
	
	public DateContainer<TInput> convertToDate() {
		return new DateContainer<TInput>(new ConvertExecutor<TInput, Date, TOutput>(this.getExpression()));
	}
	
	public DoubleContainer<TInput> convertToDouble() {
		return new DoubleContainer<TInput>(new ConvertExecutor<TInput, Double, TOutput>(this.getExpression()));
	}
	
	public FloatContainer<TInput> convertToFloat() {
		return new FloatContainer<TInput>(new ConvertExecutor<TInput, Float, TOutput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> convertToInteger() {
		return new IntegerContainer<TInput>(new ConvertExecutor<TInput, Integer, TOutput>(this.getExpression()));
	}
	
	public LongContainer<TInput> convertToLong() {
		return new LongContainer<TInput>(new ConvertExecutor<TInput, Long, TOutput>(this.getExpression()));
	}
	
	public StringContainer<TInput> convertToString() {
		return new StringContainer<TInput>(new ConvertExecutor<TInput, String, TOutput>(this.getExpression()));
	}
}
