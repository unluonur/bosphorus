package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class StringFieldByName<TInput extends ITuple> extends BaseFieldByName<TInput, String> {

	public StringFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public String execute(TInput input) {
		return input.getString(this.getFieldName());
	}
	
}
