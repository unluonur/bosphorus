package org.jcep.storm.builder;

import org.jcep.builder.ExpressionBuilder;
import org.jcep.builder.types.BooleanContainer;
import org.jcep.builder.types.DateContainer;
import org.jcep.builder.types.DoubleContainer;
import org.jcep.builder.types.FloatContainer;
import org.jcep.builder.types.IntegerContainer;
import org.jcep.builder.types.LongContainer;
import org.jcep.builder.types.StringContainer;
import org.jcep.storm.expressions.BooleanField;
import org.jcep.storm.expressions.DateField;
import org.jcep.storm.expressions.DoubleField;
import org.jcep.storm.expressions.FloatField;
import org.jcep.storm.expressions.IntegerField;
import org.jcep.storm.expressions.LongField;
import org.jcep.storm.expressions.StringField;

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
