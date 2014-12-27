package org.bosphorus.api.builder.expression.scalar.tuple;

import java.util.List;
import java.util.Map;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class MultiTupleElementExpression<TInput extends List<? extends List<? extends TOutput>>, TOutput> implements IScalarExpression<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String streamName;
	private String fieldName;

	private Map<String, Integer> map;
	
	public MultiTupleElementExpression(String streamName, String fieldName, Map<String, Integer> map) {
		this.setStreamName(streamName);
		this.setFieldName(fieldName);
		this.map = map;
	}

	public String getStreamName() {
		return streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	@Override
	public IScalarExecutor<TInput, TOutput> build() {
		return null;
		//return new ConstListElement<TInput, TOutput>(this.map.get(this.getFieldName()));
	}

}