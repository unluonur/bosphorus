package org.jcep.builder;

import java.util.Date;

import org.jcep.builder.types.BooleanContainer;
import org.jcep.builder.types.DateContainer;
import org.jcep.builder.types.DoubleContainer;
import org.jcep.builder.types.FloatContainer;
import org.jcep.builder.types.IntegerContainer;
import org.jcep.builder.types.LongContainer;
import org.jcep.builder.types.StringContainer;
import org.jcep.core.expressions.Constant;
import org.jcep.core.expressions.date.Now;

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
