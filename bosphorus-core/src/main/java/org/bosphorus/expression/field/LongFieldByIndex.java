package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;

public class LongFieldByIndex<TInput extends ITuple> extends BaseFieldByIndex<TInput, Long> {

	public LongFieldByIndex(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Long execute(TInput input) {
		return input.getLong(this.getFieldIndex());
	}
}
