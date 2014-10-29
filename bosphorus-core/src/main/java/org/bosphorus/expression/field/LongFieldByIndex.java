package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class LongFieldByIndex extends BaseFieldByIndex<Long> {

	public LongFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Long execute(ITuple input) {
		return input.getLong(this.getFieldIndex());
	}
}
