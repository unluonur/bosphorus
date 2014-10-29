package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class StringFieldByIndex<TInput extends ITuple> extends BaseFieldByIndex<TInput, String> {

	public StringFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public String execute(TInput input) {
		return input.getString(this.getFieldIndex());
	}
}
