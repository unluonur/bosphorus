package org.bosphorus.expression.field;

import org.bosphorus.stream.ITuple;

public class FloatFieldByIndex extends BaseFieldByIndex<Float> {

	public FloatFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Float execute(ITuple input) {
		return input.getFloat(this.getFieldIndex());
	}
}
