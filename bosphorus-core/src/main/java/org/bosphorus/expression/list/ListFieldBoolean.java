package org.bosphorus.expression.list;

import java.util.List;

import org.bosphorus.core.ITuple;

public class ListFieldBoolean<TInput extends List<Object>> extends BaseListField<TInput, Boolean> {

	public ListFieldBoolean(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Boolean execute(TInput input) {
		return (Boolean)input.get(this.getIndex());
	}
}
