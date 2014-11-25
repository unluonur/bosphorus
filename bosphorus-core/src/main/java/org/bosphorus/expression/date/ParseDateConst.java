package org.bosphorus.expression.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.bosphorus.expression.IExpression;

public class ParseDateConst<TInput> implements IExpression<TInput, Date> {
	private IExpression<TInput, String> expression;
	private final ThreadLocal<DateFormat> dateFormat;

	public ParseDateConst(IExpression<TInput, String> expression, String formatExpression) {
		this.expression = expression;
		this.dateFormat = new ThreadLocal<DateFormat>(){
			@Override
			protected DateFormat initialValue() {
				return new SimpleDateFormat(formatExpression, Locale.ENGLISH);
			}
		};
	}

	@Override
	public Date execute(TInput input) throws Exception {
		return dateFormat.get().parse(expression.execute(input));
	}
	
}
