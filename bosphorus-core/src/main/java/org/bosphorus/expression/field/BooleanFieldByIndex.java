package org.bosphorus.expression.field;

import org.bosphorus.stream.ITuple;

public class BooleanFieldByIndex extends BaseFieldByIndex<Boolean> {

	public BooleanFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Boolean execute(ITuple input) {
		return input.getBoolean(this.getFieldIndex());
	}
}
