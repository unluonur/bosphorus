package org.jcep.storm.expressions;

import backtype.storm.tuple.Tuple;

public class LongField extends BaseField<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2193249376414383343L;

	public LongField(String fieldName) {
		super(fieldName);
	}

	@Override
	public Long execute(Tuple input) {
		return input.getLongByField(this.getFieldName());
	}
	
}
