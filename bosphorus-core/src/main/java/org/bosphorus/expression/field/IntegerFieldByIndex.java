package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class IntegerFieldByIndex<TInput extends ITuple> extends BaseFieldByIndex<TInput, Integer> {

	public IntegerFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Integer execute(TInput input) {
		return input.getInteger(this.getFieldIndex());
	}
}
