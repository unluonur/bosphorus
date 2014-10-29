package org.bosphorus.core.type;

public class BooleanType extends BaseType<Boolean> {
	
	private static BooleanType instance;
	public static BooleanType getInstance() {
		return instance;
	}

	@Override
	public String getName() {
		return "Boolean";
	}

}
