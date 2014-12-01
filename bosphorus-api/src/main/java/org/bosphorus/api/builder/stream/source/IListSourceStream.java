package org.bosphorus.api.builder.stream.source;

import org.bosphorus.api.fluent.expression.scalar.type.list.BooleanListExpression;
import org.bosphorus.api.fluent.expression.scalar.type.list.DateListExpression;
import org.bosphorus.api.fluent.expression.scalar.type.list.DoubleListExpression;
import org.bosphorus.api.fluent.expression.scalar.type.list.FloatListExpression;
import org.bosphorus.api.fluent.expression.scalar.type.list.IntegerListExpression;
import org.bosphorus.api.fluent.expression.scalar.type.list.LongListExpression;
import org.bosphorus.api.fluent.expression.scalar.type.list.StringListExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.BooleanExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.DateExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.DoubleExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.FloatExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.IntegerExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.LongExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.StringExpression;

public interface IListSourceStream<TType> {

	IntegerExpression<TType> integerField(Integer index) throws Exception;
	LongExpression<TType> longField(Integer index) throws Exception;
	FloatExpression<TType> floatField(Integer index) throws Exception;
	DoubleExpression<TType> doubleField(Integer index) throws Exception;
	BooleanExpression<TType> booleanField(Integer index) throws Exception;
	StringExpression<TType> stringField(Integer index) throws Exception;
	DateExpression<TType> dateField(Integer index) throws Exception;
	
	IntegerListExpression<TType> integerList(Integer index) throws Exception;
	LongListExpression<TType> longList(Integer index) throws Exception;
	FloatListExpression<TType> floatList(Integer index) throws Exception;
	DoubleListExpression<TType> doubleList(Integer index) throws Exception;
	BooleanListExpression<TType> booleanList(Integer index) throws Exception;
	StringListExpression<TType> stringList(Integer index) throws Exception;
	DateListExpression<TType> dateList(Integer index) throws Exception;

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
