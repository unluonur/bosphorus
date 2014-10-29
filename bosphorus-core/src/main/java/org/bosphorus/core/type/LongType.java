package org.bosphorus.core.type;

public class LongType extends BaseType<Long> {
	
	private static LongType instance;
	public static LongType getInstance() {
		return instance;
	}

	@Override
	public String getName() {
		return "Long";
	}

}
