package org.bosphorus.storm.builder;

import org.bosphorus.builder.ExpressionBuilder;
import org.bosphorus.builder.container.BooleanContainer;
import org.bosphorus.builder.container.DateContainer;
import org.bosphorus.builder.container.DoubleContainer;
import org.bosphorus.builder.container.FloatContainer;
import org.bosphorus.builder.container.IntegerContainer;
import org.bosphorus.builder.container.LongContainer;
import org.bosphorus.builder.container.StringContainer;
import org.bosphorus.storm.expression.BooleanField;
import org.bosphorus.storm.expression.DateField;
import org.bosphorus.storm.expression.DoubleField;
import org.bosphorus.storm.expression.FloatField;
import org.bosphorus.storm.expression.IntegerField;
import org.bosphorus.storm.expression.LongField;
import org.bosphorus.storm.expression.StringField;

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
