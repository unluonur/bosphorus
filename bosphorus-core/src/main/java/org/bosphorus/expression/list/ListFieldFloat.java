package org.bosphorus.expression.list;

import java.util.List;

import org.bosphorus.core.ITuple;

public class ListFieldFloat<TInput extends List<Object>> extends BaseListField<TInput, Float> {

	public ListFieldFloat(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Float execute(TInput input) {
		return (Float)input.get(this.getIndex());
	}
}
