package org.bosphorus.api.builder.expression.scalar.date;

import java.util.Date;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.expression.scalar.executor.date.TruncateToDayExecutor;

public class TruncateToDayExpression implements IScalarExpression1<Date, Date> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IScalarExecutor1<Date, Date> build() {
		return new TruncateToDayExecutor();
	}

}
