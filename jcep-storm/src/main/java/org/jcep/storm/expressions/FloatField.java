package org.jcep.storm.expressions;

import backtype.storm.tuple.Tuple;

public class FloatField extends BaseField<Float> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -808409196184277001L;

	public FloatField(String fieldName) {
		super(fieldName);
	}

	@Override
	public Float execute(Tuple context) {
		return context.getFloatByField(this.getFieldName());
	}
	
}
