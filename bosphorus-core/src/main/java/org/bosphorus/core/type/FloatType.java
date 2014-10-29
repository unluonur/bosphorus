package org.bosphorus.core.type;

public class FloatType extends BaseType<Float> {
	
	private static FloatType instance;
	public static FloatType getInstance() {
		return instance;
	}

	@Override
	public String getName() {
		return "Float";
	}

}
