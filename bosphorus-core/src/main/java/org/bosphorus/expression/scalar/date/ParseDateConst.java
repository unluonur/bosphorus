package org.bosphorus.expression.scalar.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class ParseDateConst<TInput> implements IScalarExecutor<TInput, Date> {
	private IScalarExecutor<TInput, String> expression;
	private final ThreadLocal<DateFormat> dateFormat;

	public ParseDateConst(IScalarExecutor<TInput, String> expression, String formatExpression) {
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
