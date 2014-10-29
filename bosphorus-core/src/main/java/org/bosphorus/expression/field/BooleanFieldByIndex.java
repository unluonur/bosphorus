package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class BooleanFieldByIndex<TInput extends ITuple> extends BaseFieldByIndex<TInput, Boolean> {

	public BooleanFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Boolean execute(TInput input) {
		return input.getBoolean(this.getFieldIndex());
	}
}
