package org.bosphorus.expression.string;

import java.util.regex.Pattern;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class RegexMatch implements IExpression<Boolean> {

	private IExpression<String> pattern;
	private IExpression<String> text;
	
	@Override
	public Boolean execute(ITuple input) throws Exception {
		Pattern p = Pattern.compile(pattern.execute(input));
		return p.matcher(text.execute(input)).matches();
	}

}
