package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class LongFieldByName extends BaseFieldByName<Long> {

	public LongFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Long execute(ITuple input) {
		return input.getLong(this.getFieldName());
	}
	
}
