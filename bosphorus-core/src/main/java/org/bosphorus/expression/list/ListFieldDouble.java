package org.bosphorus.expression.list;

import java.util.List;

import org.bosphorus.core.ITuple;

public class ListFieldDouble<TInput extends List<Object>> extends BaseListField<TInput, Double> {

	public ListFieldDouble(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Double execute(TInput input) {
		return (Double)input.get(this.getIndex());
	}
}
