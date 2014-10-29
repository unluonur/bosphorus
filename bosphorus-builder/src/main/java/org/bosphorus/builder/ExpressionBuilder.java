package org.bosphorus.builder;

import java.util.Date;

import org.bosphorus.builder.container.BooleanContainer;
import org.bosphorus.builder.container.DateContainer;
import org.bosphorus.builder.container.DoubleContainer;
import org.bosphorus.builder.container.FloatContainer;
import org.bosphorus.builder.container.IntegerContainer;
import org.bosphorus.builder.container.LongContainer;
import org.bosphorus.builder.container.StringContainer;
import org.bosphorus.core.ITuple;
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

public class ExpressionBuilder {
	
	public DateContainer now() {
		return new DateContainer(new Now());
	}
	
	public IntegerContainer constant(Integer value) {
		return new IntegerContainer(new Constant<Integer>(value));
	}
	
	public LongContainer constant(Long value) {
		return new LongContainer(new Constant<Long>(value));
	}
	
	public FloatContainer constant(Float value) {
		return new FloatContainer(new Constant<Float>(value));
	}
	
	public DoubleContainer constant(Double value) {
		return new DoubleContainer(new Constant<Double>(value));
	}
	
	public StringContainer constant(String value) {
		return new StringContainer(new Constant<String>(value));
	}
	
	public DateContainer constant(Date value) {
		return new DateContainer(new Constant<Date>(value));
	}
	
	public BooleanContainer constant(Boolean value) {
		return new BooleanContainer(new Constant<Boolean>(value));
	}
	
	

	
	public IntegerContainer integerField(String fieldName) {
		return new IntegerContainer(new IntegerFieldByName(fieldName));
	}
	
	public IntegerContainer integerField(Integer fieldIndex) {
		return new IntegerContainer(new IntegerFieldByIndex(fieldIndex));
	}
	
	public LongContainer longField(String fieldName) {
		return new LongContainer(new LongFieldByName(fieldName));
	}
	
	public LongContainer longField(Integer fieldIndex) {
		return new LongContainer(new LongFieldByIndex(fieldIndex));
	}
	
	public FloatContainer floatField(String fieldName) {
		return new FloatContainer(new FloatFieldByName(fieldName));
	}
	
	public FloatContainer floatField(Integer fieldIndex) {
		return new FloatContainer(new FloatFieldByIndex(fieldIndex));
	}
	
	public DoubleContainer doubleField(String fieldName) {
		return new DoubleContainer(new DoubleFieldByName(fieldName));
	}
	
	public DoubleContainer doubleField(Integer fieldIndex) {
		return new DoubleContainer(new DoubleFieldByIndex(fieldIndex));
	}

	public StringContainer stringField(String fieldName) {
		return new StringContainer(new StringFieldByName(fieldName));
	}

	public StringContainer stringField(Integer fieldIndex) {
		return new StringContainer(new StringFieldByIndex(fieldIndex));
	}
	
	public BooleanContainer booleanField(String fieldName) {
		return new BooleanContainer(new BooleanFieldByName(fieldName));
	}
	
	public BooleanContainer booleanField(Integer fieldIndex) {
		return new BooleanContainer(new BooleanFieldByIndex(fieldIndex));
	}
	
	public DateContainer dateField(String fieldName) {
		return new DateContainer(new DateFieldByName(fieldName));
	}
	
	public DateContainer dateField(Integer fieldIndex) {
		return new DateContainer(new DateFieldByIndex(fieldIndex));
	}

}
