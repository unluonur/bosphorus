package org.bosphorus.expression.scalar.executor.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ParseDate<TInput> implements IScalarExecutor<TInput, Date> {
	private IScalarExecutor<TInput, String> expression;
	private IScalarExecutor<TInput, String> formatExpression;
	
	public ParseDate(IScalarExecutor<TInput, String> expression, IScalarExecutor<TInput, String> formatExpression) {
		this.expression = expression;
		this.formatExpression = formatExpression;
	}

	@Override
	public Date execute(TInput input) throws Exception {
		DateFormat format = new SimpleDateFormat(formatExpression.execute(input), Locale.ENGLISH);
		return format.parse(expression.execute(input));
	}
	
}
