package org.bosphorus.expression.field;

import org.bosphorus.stream.ITuple;

public class DoubleFieldByName extends BaseFieldByName<Double> {

	public DoubleFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Double execute(ITuple input) {
		return input.getDouble(this.getFieldName());
	}
	
}
