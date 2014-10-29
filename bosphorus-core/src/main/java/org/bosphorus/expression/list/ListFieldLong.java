package org.bosphorus.expression.list;

import java.util.List;

import org.bosphorus.core.ITuple;

public class ListFieldLong<TInput extends List<Object>> extends BaseListField<TInput, Long> {

	public ListFieldLong(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Long execute(TInput input) {
		return (Long)input.get(this.getIndex());
	}
}
