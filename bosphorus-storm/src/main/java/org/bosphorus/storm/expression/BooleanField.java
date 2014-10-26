package org.bosphorus.storm.expression;

import backtype.storm.tuple.Tuple;

public class BooleanField extends BaseField<Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5562722248838303989L;

	public BooleanField(String fieldName) {
		super(fieldName);
	}

	@Override
	public Boolean execute(Tuple input) {
		return input.getBooleanByField(this.getFieldName());
	}
	
}
