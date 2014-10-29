package org.bosphorus.core.type;

public class DoubleType extends BaseType<Double> {
	
	private static DoubleType instance;
	public static DoubleType getInstance() {
		return instance;
	}

	@Override
	public String getName() {
		return "Double";
	}

}
