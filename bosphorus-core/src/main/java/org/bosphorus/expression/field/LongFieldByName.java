package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class LongFieldByName<TInput extends ITuple> extends BaseFieldByName<TInput, Long> {

	public LongFieldByName(String fieldName) {
		super(fieldName);
	}

	@Override
	public Long execute(TInput input) {
		return input.getLong(this.getFieldName());
	}
	
}
