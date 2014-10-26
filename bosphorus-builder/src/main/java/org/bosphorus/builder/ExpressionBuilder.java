package org.bosphorus.builder;

import java.util.Date;

import org.bosphorus.builder.container.BooleanContainer;
import org.bosphorus.builder.container.DateContainer;
import org.bosphorus.builder.container.DoubleContainer;
import org.bosphorus.builder.container.FloatContainer;
import org.bosphorus.builder.container.IntegerContainer;
import org.bosphorus.builder.container.LongContainer;
import org.bosphorus.builder.container.StringContainer;
import org.bosphorus.core.expression.Constant;
import org.bosphorus.core.expression.date.Now;

public class ExpressionBuilder<TInput> {
	
	public DateContainer<TInput> now() {
		return new DateContainer<TInput>(new Now<TInput>());
	}
	
	public IntegerContainer<TInput> constant(Integer value) {
		return new IntegerContainer<TInput>(new Constant<TInput, Integer>(value));
	}
	
	public LongContainer<TInput> constant(Long value) {
		return new LongContainer<TInput>(new Constant<TInput, Long>(value));
	}
	
	public FloatContainer<TInput> constant(Float value) {
		return new FloatContainer<TInput>(new Constant<TInput, Float>(value));
	}
	
	public DoubleContainer<TInput> constant(Double value) {
		return new DoubleContainer<TInput>(new Constant<TInput, Double>(value));
	}
	
	public StringContainer<TInput> constant(String value) {
		return new StringContainer<TInput>(new Constant<TInput, String>(value));
	}
	
	public DateContainer<TInput> constant(Date value) {
		return new DateContainer<TInput>(new Constant<TInput, Date>(value));
	}
	
	public BooleanContainer<TInput> constant(Boolean value) {
		return new BooleanContainer<TInput>(new Constant<TInput, Boolean>(value));
	}
	
}
