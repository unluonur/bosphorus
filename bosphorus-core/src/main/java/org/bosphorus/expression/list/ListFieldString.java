package org.bosphorus.expression.list;

import java.util.List;

import org.bosphorus.core.ITuple;

public class ListFieldString<TInput extends List<Object>> extends BaseListField<TInput, String> {

	public ListFieldString(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public String execute(TInput input) {
		return (String)input.get(this.getIndex());
	}
}
