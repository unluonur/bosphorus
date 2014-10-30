package org.bosphorus.expression.stream;

import java.util.Date;
import java.util.List;

import org.bosphorus.core.ITuple;

public class StreamFieldDate<TInput extends List<Object>> extends BaseStreamField<TInput, Date> {

	public StreamFieldDate(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Date execute(TInput input) {
		return (Date)input.get(this.getFieldIndex());
	}
}
