package org.bosphorus.expression.field;

import org.bosphorus.stream.ITuple;

public class DoubleFieldByIndex extends BaseFieldByIndex<Double> {

	public DoubleFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Double execute(ITuple input) {
		return input.getDouble(this.getFieldIndex());
	}
}
