package org.bosphorus.expression.field;

import java.util.Date;
import org.bosphorus.stream.ITuple;

public class DateFieldByName extends BaseFieldByName<Date> {

	public DateFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Date execute(ITuple input) {
		return input.getDate(this.getFieldName());
	}
	
}
