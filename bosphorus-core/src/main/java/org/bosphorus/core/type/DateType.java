package org.bosphorus.core.type;

import java.util.Date;

public class DateType extends BaseType<Date> {
	
	private static DateType instance;
	public static DateType getInstance() {
		return instance;
	}

	@Override
	public String getName() {
		return "Date";
	}

}
