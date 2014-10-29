package org.bosphorus.expression.list;

import java.util.Date;
import java.util.List;

import org.bosphorus.core.ITuple;

public class ListFieldDate<TInput extends List<Object>> extends BaseListField<TInput, Date> {

	public ListFieldDate(Integer fieldIndex) {
		super(fieldIndex);
	}

	@Override
	public Date execute(TInput input) {
		return (Date)input.get(this.getIndex());
	}
}
