package org.bosphorus.api.stream;

import java.io.Serializable;

import org.bosphorus.api.expression.scalar.type.list.BooleanListExpression;
import org.bosphorus.api.expression.scalar.type.list.DateListExpression;
import org.bosphorus.api.expression.scalar.type.list.DoubleListExpression;
import org.bosphorus.api.expression.scalar.type.list.FloatListExpression;
import org.bosphorus.api.expression.scalar.type.list.IntegerListExpression;
import org.bosphorus.api.expression.scalar.type.list.LongListExpression;
import org.bosphorus.api.expression.scalar.type.list.StringListExpression;
import org.bosphorus.api.expression.scalar.type.primitive.BooleanExpression;
import org.bosphorus.api.expression.scalar.type.primitive.DateExpression;
import org.bosphorus.api.expression.scalar.type.primitive.DoubleExpression;
import org.bosphorus.api.expression.scalar.type.primitive.FloatExpression;
import org.bosphorus.api.expression.scalar.type.primitive.IntegerExpression;
import org.bosphorus.api.expression.scalar.type.primitive.LongExpression;
import org.bosphorus.api.expression.scalar.type.primitive.StringExpression;

public interface ISourceStream<TType> extends Serializable {
	
	IntegerExpression<TType> integerField(String name) throws Exception;
	LongExpression<TType> longField(String name) throws Exception;
	FloatExpression<TType> floatField(String name) throws Exception;
	DoubleExpression<TType> doubleField(String name) throws Exception;
	BooleanExpression<TType> booleanField(String name) throws Exception;
	StringExpression<TType> stringField(String name) throws Exception;
	DateExpression<TType> dateField(String name) throws Exception;
	
	IntegerListExpression<TType> integerList(String name) throws Exception;
	LongListExpression<TType> longList(String name) throws Exception;
	FloatListExpression<TType> floatList(String name) throws Exception;
	DoubleListExpression<TType> doubleList(String name) throws Exception;
	BooleanListExpression<TType> booleanList(String name) throws Exception;
	StringListExpression<TType> stringList(String name) throws Exception;
	DateListExpression<TType> dateList(String name) throws Exception;

}
