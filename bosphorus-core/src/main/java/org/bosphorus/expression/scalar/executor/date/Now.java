package org.bosphorus.expression.scalar.executor.date;

import java.util.Date;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class Now<TInput> implements IScalarExecutor<TInput, Date> {
	
	@Override
	public Date execute(TInput input) {
		return new Date();
	}

}
