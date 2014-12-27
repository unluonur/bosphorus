package org.bosphorus.api.builder.expression.scalar.tuple;

import java.util.List;
import java.util.Map;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.list.ConstListElement;

public class SimpleTupleElementExpression<TInput extends List<? extends TOutput>, TOutput> implements IScalarExpression<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fieldName;
	private Map<String, Integer> map;
	
	public SimpleTupleElementExpression(Map<String, Integer> map, String fieldName) {
		this.map = map;
		this.setFieldName(fieldName);
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	@Override
	public IScalarExecutor<TInput, TOutput> build() {
		return new ConstListElement<TInput, TOutput>(this.map.get(this.getFieldName()));
	}

}