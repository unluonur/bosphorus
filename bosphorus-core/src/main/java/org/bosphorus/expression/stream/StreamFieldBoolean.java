package org.bosphorus.expression.stream;

import java.util.List;

public class StreamFieldBoolean<TInput extends List<Object>> extends BaseStreamField<TInput, Boolean> {

	public StreamFieldBoolean(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Boolean execute(TInput input) {
		return (Boolean)input.get(this.getFieldIndex());
	}
}
