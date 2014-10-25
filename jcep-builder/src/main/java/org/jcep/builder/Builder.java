package org.jcep.builder;

import java.util.Date;

import org.jcep.builder.types.BooleanGetter;
import org.jcep.builder.types.DateGetter;
import org.jcep.builder.types.DoubleGetter;
import org.jcep.builder.types.FloatGetter;
import org.jcep.builder.types.IntegerGetter;
import org.jcep.builder.types.LongGetter;
import org.jcep.builder.types.StringGetter;
import org.jcep.core.expressions.common.Constant;
import org.jcep.core.expressions.date.Now;

public class Builder<TContext> {
	
	public DateGetter<TContext> now() {
		return new DateGetter<TContext>(new Now<TContext>());
	}
	
	public IntegerGetter<TContext> constant(Integer value) {
		return new IntegerGetter<TContext>(new Constant<Integer, TContext>(value));
	}
	
	public LongGetter<TContext> constant(Long value) {
		return new LongGetter<TContext>(new Constant<Long, TContext>(value));
	}
	
	public FloatGetter<TContext> constant(Float value) {
		return new FloatGetter<TContext>(new Constant<Float, TContext>(value));
	}
	
	public DoubleGetter<TContext> constant(Double value) {
		return new DoubleGetter<TContext>(new Constant<Double, TContext>(value));
	}
	
	public StringGetter<TContext> constant(String value) {
		return new StringGetter<TContext>(new Constant<String, TContext>(value));
	}
	
	public DateGetter<TContext> constant(Date value) {
		return new DateGetter<TContext>(new Constant<Date, TContext>(value));
	}
	
	public BooleanGetter<TContext> constant(Boolean value) {
		return new BooleanGetter<TContext>(new Constant<Boolean, TContext>(value));
	}
	
}
