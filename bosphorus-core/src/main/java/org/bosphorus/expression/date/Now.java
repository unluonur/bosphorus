package org.bosphorus.expression.date;

import java.util.Date;
import org.bosphorus.expression.IExpression;

public class Now<TInput> implements IExpression<TInput, Date> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9102709953893651584L;

	@Override
	public Date execute(TInput input) {
		return new Date();
	}

}
