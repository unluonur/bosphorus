package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class FloatFieldByName<TInput extends ITuple> extends BaseFieldByName<TInput, Float> {

	public FloatFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Float execute(TInput input) {
		return input.getFloat(this.getFieldName());
	}
	
}
