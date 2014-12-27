package org.bosphorus.api.fluent.tuple;

import java.util.List;

import org.bosphorus.api.fluent.expression.scalar.type.primitive.IntegerExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.ObjectExpression;

public class ListTuple<TType> {
	private List<String> fields;
	
	public ObjectExpression<List<TType>> field(String fieldName) {
		return null;
	}
	
	public IntegerExpression<List<TType>> integerField(String fieldName) {
		return null;
	}
}
