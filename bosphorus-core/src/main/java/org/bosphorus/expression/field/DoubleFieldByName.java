package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class DoubleFieldByName<TInput extends ITuple> extends BaseFieldByName<TInput, Double> {

	public DoubleFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Double execute(TInput input) {
		return input.getDouble(this.getFieldName());
	}
	
}
