package org.bosphorus.storm.builder;

import org.bosphorus.builder.ExpressionBuilder;
import org.bosphorus.builder.types.BooleanContainer;
import org.bosphorus.builder.types.DateContainer;
import org.bosphorus.builder.types.DoubleContainer;
import org.bosphorus.builder.types.FloatContainer;
import org.bosphorus.builder.types.IntegerContainer;
import org.bosphorus.builder.types.LongContainer;
import org.bosphorus.builder.types.StringContainer;
import org.bosphorus.storm.expressions.BooleanField;
import org.bosphorus.storm.expressions.DateField;
import org.bosphorus.storm.expressions.DoubleField;
import org.bosphorus.storm.expressions.FloatField;
import org.bosphorus.storm.expressions.IntegerField;
import org.bosphorus.storm.expressions.LongField;
import org.bosphorus.storm.expressions.StringField;

import backtype.storm.tuple.Tuple;

public class StormBuilder extends ExpressionBuilder<Tuple> {

	public IntegerContainer<Tuple> integerField(String fieldName) {
		return new IntegerContainer<Tuple>(new IntegerField(fieldName));
	}
	
	public LongContainer<Tuple> longField(String fieldName) {
		return new LongContainer<Tuple>(new LongField(fieldName));
	}
	
	public FloatContainer<Tuple> floatField(String fieldName) {
		return new FloatContainer<Tuple>(new FloatField(fieldName));
	}
	
	public DoubleContainer<Tuple> doubleField(String fieldName) {
		return new DoubleContainer<Tuple>(new DoubleField(fieldName));
	}

	public StringContainer<Tuple> stringField(String fieldName) {
		return new StringContainer<Tuple>(new StringField(fieldName));
	}
	
	public BooleanContainer<Tuple> booleanField(String fieldName) {
		return new BooleanContainer<Tuple>(new BooleanField(fieldName));
	}
	
	public DateContainer<Tuple> dateField(String fieldName) {
		return new DateContainer<Tuple>(new DateField(fieldName));
	}
	
}
