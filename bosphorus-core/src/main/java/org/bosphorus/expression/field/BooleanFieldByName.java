package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class BooleanFieldByName<TInput extends ITuple> extends BaseFieldByName<TInput, Boolean> {

	public BooleanFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Boolean execute(TInput input) {
		return input.getBoolean(this.getFieldName());
	}
}
