package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class BooleanFieldByName extends BaseFieldByName<Boolean> {

	public BooleanFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Boolean execute(ITuple input) {
		return input.getBoolean(this.getFieldName());
	}
}
