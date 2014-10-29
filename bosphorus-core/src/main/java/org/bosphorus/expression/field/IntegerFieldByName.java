package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class IntegerFieldByName extends BaseFieldByName<Integer> {

	public IntegerFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Integer execute(ITuple input) {
		return input.getInteger(this.getFieldName());
	}
	
}
