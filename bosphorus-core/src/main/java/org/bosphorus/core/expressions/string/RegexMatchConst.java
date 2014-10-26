package org.bosphorus.core.expressions.string;

import java.util.regex.Pattern;

import org.bosphorus.core.expressions.IExpression;

public class RegexMatchConst<TInput> implements IExpression<TInput, Boolean> {

	private Pattern pattern;
	private IExpression<TInput, String> text;
	
	public RegexMatchConst(String pattern, IExpression<TInput, String> text) {
		this.pattern = Pattern.compile(pattern);
		this.text = text;
	}
	
	@Override
	public Boolean execute(TInput input) throws Exception {
		return pattern.matcher(text.execute(input)).matches();
	}

}
