package org.bosphorus.expression.field;

import java.util.Date;

import org.bosphorus.core.ITuple;

public class DateFieldByIndex<TInput extends ITuple> extends BaseFieldByIndex<TInput, Date> {

	public DateFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Date execute(TInput input) {
		return input.getDate(this.getFieldIndex());
	}
}
