package org.bosphorus.expression.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.bosphorus.expression.IExpression;

public class ParseDate<TInput> implements IExpression<TInput, Date> {
	private IExpression<TInput, String> expression;
	private IExpression<TInput, String> formatExpression;
	
	public ParseDate(IExpression<TInput, String> expression, IExpression<TInput, String> formatExpression) {
		this.expression = expression;
		this.formatExpression = formatExpression;
	}

	@Override
	public Date execute(TInput input) throws Exception {
		DateFormat format = new SimpleDateFormat(formatExpression.execute(input), Locale.ENGLISH);
		return format.parse(expression.execute(input));
	}
	
}
