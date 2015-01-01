package org.bosphorus.api.fluent.stream;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.api.builder.expression.scalar.list.ConstListElementExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.ObjectExpression;

public class ListStream extends Stream<List<Object>> {
	private List<String> fieldNames;
	
	public ListStream() {
		this.fieldNames = new ArrayList<String>();
	}
	
	public ListStream(List<String> fieldNames) {
		this.fieldNames = fieldNames;
	}
	
	public ListStream(String... fieldNames) {
		this.fieldNames = new ArrayList<String>();
		for(String field: fieldNames) {
			this.fieldNames.add(field);
		}
	}
	
	public ObjectExpression<List<Object>> field(Integer fieldIndex) {
		return new ObjectExpression<List<Object>>(new ConstListElementExpression<List<Object>, Object>(fieldIndex));
	}
	
	public ObjectExpression<List<Object>> field(String fieldName) {
		return field(this.fieldNames.indexOf(fieldName));
	}
}