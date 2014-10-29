package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class IntegerFieldByName<TInput extends ITuple> extends BaseFieldByName<TInput, Integer> {

	public IntegerFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Integer execute(TInput input) {
		return input.getInteger(this.getFieldName());
	}
	
}
