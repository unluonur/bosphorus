package org.jcep.storm.expressions;

import backtype.storm.tuple.Tuple;

public class DoubleField extends BaseField<Double> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8103197643995260056L;

	public DoubleField(String fieldName) {
		super(fieldName);
	}

	@Override
	public Double execute(Tuple context) {
		return context.getDoubleByField(this.getFieldName());
	}
	
}
