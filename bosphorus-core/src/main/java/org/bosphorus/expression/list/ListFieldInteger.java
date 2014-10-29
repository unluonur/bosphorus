package org.bosphorus.expression.list;

import java.util.List;

import org.bosphorus.core.ITuple;

public class ListFieldInteger<TInput extends List<Object>> extends BaseListField<TInput, Integer> {

	public ListFieldInteger(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Integer execute(TInput input) {
		return (Integer)input.get(this.getIndex());
	}
}
