package org.jcep.builder;

import java.util.Date;

import org.jcep.builder.types.BooleanGetter;
import org.jcep.builder.types.DateGetter;
import org.jcep.builder.types.DoubleGetter;
import org.jcep.builder.types.FloatGetter;
import org.jcep.builder.types.IntegerGetter;
import org.jcep.builder.types.LongGetter;
import org.jcep.builder.types.StringGetter;
import org.jcep.core.expressions.Constant;
import org.jcep.core.expressions.date.Now;

public class Builder<TInput> {
	
	public DateGetter<TInput> now() {
		return new DateGetter<TInput>(new Now<TInput>());
	}
	
	public IntegerGetter<TInput> constant(Integer value) {
		return new IntegerGetter<TInput>(new Constant<TInput, Integer>(value));
	}
	
	public LongGetter<TInput> constant(Long value) {
		return new LongGetter<TInput>(new Constant<TInput, Long>(value));
	}
	
	public FloatGetter<TInput> constant(Float value) {
		return new FloatGetter<TInput>(new Constant<TInput, Float>(value));
	}
	
	public DoubleGetter<TInput> constant(Double value) {
		return new DoubleGetter<TInput>(new Constant<TInput, Double>(value));
	}
	
	public StringGetter<TInput> constant(String value) {
		return new StringGetter<TInput>(new Constant<TInput, String>(value));
	}
	
	public DateGetter<TInput> constant(Date value) {
		return new DateGetter<TInput>(new Constant<TInput, Date>(value));
	}
	
	public BooleanGetter<TInput> constant(Boolean value) {
		return new BooleanGetter<TInput>(new Constant<TInput, Boolean>(value));
	}
	
}
