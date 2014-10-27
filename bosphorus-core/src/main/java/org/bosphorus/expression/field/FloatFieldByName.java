package org.bosphorus.expression.field;

import org.bosphorus.stream.ITuple;

public class FloatFieldByName extends BaseFieldByName<Float> {

	public FloatFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Float execute(ITuple input) {
		return input.getFloat(this.getFieldName());
	}
	
}
