package org.bosphorus.builder.old;

import java.util.Date;

import org.bosphorus.builder.container.BooleanContainer;
import org.bosphorus.builder.container.DateContainer;
import org.bosphorus.builder.container.DoubleContainer;
import org.bosphorus.builder.container.FloatContainer;
import org.bosphorus.builder.container.IntegerContainer;
import org.bosphorus.builder.container.LongContainer;
import org.bosphorus.builder.container.StringContainer;
import org.bosphorus.expression.scalar.executor.common.ConstantExecutor;
import org.bosphorus.expression.scalar.executor.date.NowExecutor;

public class ExpressionBuilder<TInput> {
	
	public DateContainer<TInput> now() {
		return new DateContainer<TInput>(new NowExecutor<TInput>());
	}
	
	public IntegerContainer<TInput> constant(Integer value) {
		return new IntegerContainer<TInput>(new ConstantExecutor<TInput, Integer>(value));
	}
	
	public LongContainer<TInput> constant(Long value) {
		return new LongContainer<TInput>(new ConstantExecutor<TInput, Long>(value));
	}
	
	public FloatContainer<TInput> constant(Float value) {
		return new FloatContainer<TInput>(new ConstantExecutor<TInput, Float>(value));
	}
	
	public DoubleContainer<TInput> constant(Double value) {
		return new DoubleContainer<TInput>(new ConstantExecutor<TInput, Double>(value));
	}
	
	public StringContainer<TInput> constant(String value) {
		return new StringContainer<TInput>(new ConstantExecutor<TInput, String>(value));
	}
	
	public DateContainer<TInput> constant(Date value) {
		return new DateContainer<TInput>(new ConstantExecutor<TInput, Date>(value));
	}
	
	public BooleanContainer<TInput> constant(Boolean value) {
		return new BooleanContainer<TInput>(new ConstantExecutor<TInput, Boolean>(value));
	}
	
	

	/*
	public IntegerContainer<TInput> integerField(String fieldName) {
		return new IntegerContainer<TInput>(new IntegerFieldByName<TInput>(fieldName));
	}
	
	public IntegerContainer<TInput> integerField(Integer fieldIndex) {
		return new IntegerContainer<TInput>(new IntegerFieldByIndex<TInput>(fieldIndex));
	}
	
	public LongContainer<TInput> longField(String fieldName) {
		return new LongContainer<TInput>(new LongFieldByName<TInput>(fieldName));
	}
	
	public LongContainer<TInput> longField(Integer fieldIndex) {
		return new LongContainer<TInput>(new LongFieldByIndex<TInput>(fieldIndex));
	}
	
	public FloatContainer<TInput> floatField(String fieldName) {
		return new FloatContainer<TInput>(new FloatFieldByName<TInput>(fieldName));
	}
	
	public FloatContainer<TInput> floatField(Integer fieldIndex) {
		return new FloatContainer<TInput>(new FloatFieldByIndex<TInput>(fieldIndex));
	}
	
	public DoubleContainer<TInput> doubleField(String fieldName) {
		return new DoubleContainer<TInput>(new DoubleFieldByName<TInput>(fieldName));
	}
	
	public DoubleContainer<TInput> doubleField(Integer fieldIndex) {
		return new DoubleContainer<TInput>(new DoubleFieldByIndex<TInput>(fieldIndex));
	}

	public StringContainer<TInput> stringField(String fieldName) {
		return new StringContainer<TInput>(new StringFieldByName<TInput>(fieldName));
	}

	public StringContainer<TInput> stringField(Integer fieldIndex) {
		return new StringContainer<TInput>(new StringFieldByIndex<TInput>(fieldIndex));
	}
	
	public BooleanContainer<TInput> booleanField(String fieldName) {
		return new BooleanContainer<TInput>(new BooleanFieldByName<TInput>(fieldName));
	}
	
	public BooleanContainer<TInput> booleanField(Integer fieldIndex) {
		return new BooleanContainer<TInput>(new BooleanFieldByIndex<TInput>(fieldIndex));
	}
	
	public DateContainer<TInput> dateField(String fieldName) {
		return new DateContainer<TInput>(new DateFieldByName<TInput>(fieldName));
	}
	
	public DateContainer<TInput> dateField(Integer fieldIndex) {
		return new DateContainer<TInput>(new DateFieldByIndex<TInput>(fieldIndex));
	}
	
	*/

}
