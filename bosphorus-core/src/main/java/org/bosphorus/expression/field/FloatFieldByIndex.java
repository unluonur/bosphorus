package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class FloatFieldByIndex<TInput extends ITuple> extends BaseFieldByIndex<TInput, Float> {

	public FloatFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Float execute(TInput input) {
		return input.getFloat(this.getFieldIndex());
	}
}
