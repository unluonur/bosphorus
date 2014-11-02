package org.bosphorus.expression.stream;

import java.util.List;

public class StreamFieldLong<TInput extends List<Object>> extends BaseStreamField<TInput, Long> {

	public StreamFieldLong(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Long execute(TInput input) {
		return (Long)input.get(this.getFieldIndex());
	}
}
