package org.bosphorus.expression.scalar.string;

import java.util.regex.Pattern;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class RegexMatch<TInput> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<TInput, String> pattern;
	private IScalarExecutor<TInput, String> text;
	
	@Override
	public Boolean execute(TInput input) throws Exception {
		Pattern p = Pattern.compile(pattern.execute(input));
		return p.matcher(text.execute(input)).matches();
	}

}
