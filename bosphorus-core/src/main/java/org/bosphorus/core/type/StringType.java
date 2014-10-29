package org.bosphorus.core.type;

public class StringType extends BaseType<String> {
	
	private static StringType instance;
	public static StringType getInstance() {
		return instance;
	}

	@Override
	public String getName() {
		return "String";
	}

}
