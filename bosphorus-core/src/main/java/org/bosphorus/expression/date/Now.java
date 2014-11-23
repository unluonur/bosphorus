package org.bosphorus.expression.date;

import java.util.Date;
import org.bosphorus.expression.IExpression;

public class Now<TInput> implements IExpression<TInput, Date> {
	
	@Override
	public Date execute(TInput input) {
		return new Date();
	}

}
