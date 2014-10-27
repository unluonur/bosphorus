package org.bosphorus.expression.field;

import java.util.Date;

import org.bosphorus.stream.ITuple;

public class DateFieldByIndex extends BaseFieldByIndex<Date> {

	public DateFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Date execute(ITuple input) {
		return input.getDate(this.getFieldIndex());
	}
}
