package org.bosphorus.expression.field;

import org.bosphorus.stream.ITuple;

public class StringFieldByIndex extends BaseFieldByIndex<String> {

	public StringFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public String execute(ITuple input) {
		return input.getString(this.getFieldIndex());
	}
}
