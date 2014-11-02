package org.bosphorus.expression.stream;

import java.util.List;

public class StreamFieldDouble<TInput extends List<Object>> extends BaseStreamField<TInput, Double> {

	public StreamFieldDouble(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Double execute(TInput input) {
		return (Double)input.get(this.getFieldIndex());
	}
}
