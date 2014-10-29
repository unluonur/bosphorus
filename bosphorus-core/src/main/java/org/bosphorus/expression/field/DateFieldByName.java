package org.bosphorus.expression.field;

import java.util.Date;

import org.bosphorus.core.ITuple;

public class DateFieldByName<TInput extends ITuple> extends BaseFieldByName<TInput, Date> {

	public DateFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Date execute(TInput input) {
		return input.getDate(this.getFieldName());
	}
	
}
