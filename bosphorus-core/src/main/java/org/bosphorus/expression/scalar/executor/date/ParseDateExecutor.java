package org.bosphorus.expression.scalar.executor.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ParseDateExecutor<TInput> implements IScalarExecutor<TInput, Date> {
	private IScalarExecutor<? super TInput, String> expression;
	private IScalarExecutor<? super TInput, String> formatExpression;
	
	public ParseDateExecutor(IScalarExecutor<? super TInput, String> expression, 
			IScalarExecutor<? super TInput, String> formatExpression) {
		this.expression = expression;
		this.formatExpression = formatExpression;
	}

	@Override
	public Date execute(TInput input) throws Exception {
		DateFormat format = new SimpleDateFormat(formatExpression.execute(input), Locale.ENGLISH);
		return format.parse(expression.execute(input));
	}
	
}
