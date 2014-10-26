package org.bosphorus.storm.expression;

import backtype.storm.tuple.Tuple;

public class StringField extends BaseField<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3793797669100981115L;

	public StringField(String fieldName) {
		super(fieldName);
	}

	@Override
	public String execute(Tuple input) {
		return input.getStringByField(this.getFieldName());
	}
	
}
