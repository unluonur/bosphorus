package org.bosphorus.expression.field;

import org.bosphorus.stream.ITuple;

public class StringFieldByName extends BaseFieldByName<String> {

	public StringFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public String execute(ITuple input) {
		return input.getString(this.getFieldName());
	}
	
}
