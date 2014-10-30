package org.bosphorus.expression.stream;

import java.util.List;

import org.bosphorus.core.ITuple;

public class StreamFieldFloat<TInput extends List<Object>> extends BaseStreamField<TInput, Float> {

	public StreamFieldFloat(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Float execute(TInput input) {
		return (Float)input.get(this.getFieldIndex());
	}
}
