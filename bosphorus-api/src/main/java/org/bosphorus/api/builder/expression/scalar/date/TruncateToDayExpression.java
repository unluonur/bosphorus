package org.bosphorus.api.builder.expression.scalar.date;

import java.util.Date;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.expression.scalar.factory.date.TruncateToDayExecutorFactory;

public class TruncateToDayExpression implements IScalarExpression1<Date, Date> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IScalarExecutorFactory1<Date, Date> build() {
		return new TruncateToDayExecutorFactory();
	}

}
