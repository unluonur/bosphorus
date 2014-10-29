package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class DoubleFieldByIndex<TInput extends ITuple> extends BaseFieldByIndex<TInput, Double> {

	public DoubleFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Double execute(TInput input) {
		return input.getDouble(this.getFieldIndex());
	}
}
