package org.bosphorus.expression.stream;

import java.util.List;

import org.bosphorus.core.ITuple;

public class StreamFieldInteger<TInput extends List<Object>> extends BaseStreamField<TInput, Integer> {

	public StreamFieldInteger(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Integer execute(TInput input) {
		return (Integer)input.get(this.getFieldIndex());
	}
}
