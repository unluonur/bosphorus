package org.jcep.storm.expressions;

import backtype.storm.tuple.Tuple;

public class IntegerField extends BaseField<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1357496549989937987L;

	public IntegerField(String fieldName) {
		super(fieldName);
	}

	@Override
	public Integer execute(Tuple input) {
		return input.getIntegerByField(this.getFieldName());
	}
	
}
