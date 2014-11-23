package org.bosphorus.builder.expression;

public class ConstantIntegerBuilder<TInput> extends BaseConstantBuilder<TInput, Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String serialize() {
		return this.getValue().toString();
	}

}
