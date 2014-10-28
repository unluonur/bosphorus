package org.bosphorus.expression.string;

import java.util.regex.Pattern;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class RegexMatchConst implements IExpression<Boolean> {

	private Pattern pattern;
	private IExpression<String> text;
	
	public RegexMatchConst(String pattern, IExpression<String> text) {
		this.pattern = Pattern.compile(pattern);
		this.text = text;
	}
	
	@Override
	public Boolean execute(ITuple input) throws Exception {
		return pattern.matcher(text.execute(input)).matches();
	}

}
