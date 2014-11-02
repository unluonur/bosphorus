package org.bosphorus.expression.stream;

import java.util.List;

public class StreamFieldString<TInput extends List<Object>> extends BaseStreamField<TInput, String> {

	public StreamFieldString(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public String execute(TInput input) {
		return (String)input.get(this.getFieldIndex());
	}
}
