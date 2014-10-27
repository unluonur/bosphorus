package org.bosphorus.builder;

import java.util.Date;

import org.bosphorus.builder.container.BooleanContainer;
import org.bosphorus.builder.container.DateContainer;
import org.bosphorus.builder.container.DoubleContainer;
import org.bosphorus.builder.container.FloatContainer;
import org.bosphorus.builder.container.IntegerContainer;
import org.bosphorus.builder.container.LongContainer;
import org.bosphorus.builder.container.StringContainer;
import org.bosphorus.expression.Constant;
import org.bosphorus.expression.date.Now;
import org.bosphorus.expression.field.BooleanFieldByIndex;
import org.bosphorus.expression.field.BooleanFieldByName;
import org.bosphorus.expression.field.DateFieldByIndex;
import org.bosphorus.expression.field.DateFieldByName;
import org.bosphorus.expression.field.DoubleFieldByIndex;
import org.bosphorus.expression.field.DoubleFieldByName;
import org.bosphorus.expression.field.FloatFieldByIndex;
import org.bosphorus.expression.field.FloatFieldByName;
import org.bosphorus.expression.field.IntegerFieldByIndex;
import org.bosphorus.expression.field.IntegerFieldByName;
import org.bosphorus.expression.field.LongFieldByIndex;
import org.bosphorus.expression.field.LongFieldByName;
import org.bosphorus.expression.field.StringFieldByIndex;
import org.bosphorus.expression.field.StringFieldByName;
import org.bosphorus.stream.ITuple;

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
	
	

	
	public IntegerContainer<ITuple> integerField(String fieldName) {
		return new IntegerContainer<ITuple>(new IntegerFieldByName(fieldName));
	}
	
	public IntegerContainer<ITuple> integerField(Integer fieldIndex) {
		return new IntegerContainer<ITuple>(new IntegerFieldByIndex(fieldIndex));
	}
	
	public LongContainer<ITuple> longField(String fieldName) {
		return new LongContainer<ITuple>(new LongFieldByName(fieldName));
	}
	
	public LongContainer<ITuple> longField(Integer fieldIndex) {
		return new LongContainer<ITuple>(new LongFieldByIndex(fieldIndex));
	}
	
	public FloatContainer<ITuple> floatField(String fieldName) {
		return new FloatContainer<ITuple>(new FloatFieldByName(fieldName));
	}
	
	public FloatContainer<ITuple> floatField(Integer fieldIndex) {
		return new FloatContainer<ITuple>(new FloatFieldByIndex(fieldIndex));
	}
	
	public DoubleContainer<ITuple> doubleField(String fieldName) {
		return new DoubleContainer<ITuple>(new DoubleFieldByName(fieldName));
	}
	
	public DoubleContainer<ITuple> doubleField(Integer fieldIndex) {
		return new DoubleContainer<ITuple>(new DoubleFieldByIndex(fieldIndex));
	}

	public StringContainer<ITuple> stringField(String fieldName) {
		return new StringContainer<ITuple>(new StringFieldByName(fieldName));
	}

	public StringContainer<ITuple> stringField(Integer fieldIndex) {
		return new StringContainer<ITuple>(new StringFieldByIndex(fieldIndex));
	}
	
	public BooleanContainer<ITuple> booleanField(String fieldName) {
		return new BooleanContainer<ITuple>(new BooleanFieldByName(fieldName));
	}
	
	public BooleanContainer<ITuple> booleanField(Integer fieldIndex) {
		return new BooleanContainer<ITuple>(new BooleanFieldByIndex(fieldIndex));
	}
	
	public DateContainer<ITuple> dateField(String fieldName) {
		return new DateContainer<ITuple>(new DateFieldByName(fieldName));
	}
	
	public DateContainer<ITuple> dateField(Integer fieldIndex) {
		return new DateContainer<ITuple>(new DateFieldByIndex(fieldIndex));
	}

}
