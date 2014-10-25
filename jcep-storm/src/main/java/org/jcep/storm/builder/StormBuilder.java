package org.jcep.storm.builder;

import org.jcep.builder.Builder;
import org.jcep.builder.types.BooleanGetter;
import org.jcep.builder.types.DateGetter;
import org.jcep.builder.types.DoubleGetter;
import org.jcep.builder.types.FloatGetter;
import org.jcep.builder.types.IntegerGetter;
import org.jcep.builder.types.LongGetter;
import org.jcep.builder.types.StringGetter;
import org.jcep.storm.expressions.BooleanField;
import org.jcep.storm.expressions.DateField;
import org.jcep.storm.expressions.DoubleField;
import org.jcep.storm.expressions.FloatField;
import org.jcep.storm.expressions.IntegerField;
import org.jcep.storm.expressions.LongField;
import org.jcep.storm.expressions.StringField;

import backtype.storm.tuple.Tuple;

public class StormBuilder extends Builder<Tuple> {

	public IntegerGetter<Tuple> integerField(String fieldName) {
		return new IntegerGetter<Tuple>(new IntegerField(fieldName));
	}
	
	public LongGetter<Tuple> longField(String fieldName) {
		return new LongGetter<Tuple>(new LongField(fieldName));
	}
	
	public FloatGetter<Tuple> floatField(String fieldName) {
		return new FloatGetter<Tuple>(new FloatField(fieldName));
	}
	
	public DoubleGetter<Tuple> doubleField(String fieldName) {
		return new DoubleGetter<Tuple>(new DoubleField(fieldName));
	}

	public StringGetter<Tuple> stringField(String fieldName) {
		return new StringGetter<Tuple>(new StringField(fieldName));
	}
	
	public BooleanGetter<Tuple> booleanField(String fieldName) {
		return new BooleanGetter<Tuple>(new BooleanField(fieldName));
	}
	
	public DateGetter<Tuple> dateField(String fieldName) {
		return new DateGetter<Tuple>(new DateField(fieldName));
	}
	
}
