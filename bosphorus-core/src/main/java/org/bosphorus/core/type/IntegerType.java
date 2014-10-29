package org.bosphorus.core.type;

public class IntegerType extends BaseType<Integer> {
	
	private static IntegerType instance;
	public static IntegerType getInstance() {
		return instance;
	}

	@Override
	public String getName() {
		return "Integer";
	}

}
