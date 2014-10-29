package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class IntegerFieldByIndex extends BaseFieldByIndex<Integer> {

	public IntegerFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Integer execute(ITuple input) {
		return input.getInteger(this.getFieldIndex());
	}
}
