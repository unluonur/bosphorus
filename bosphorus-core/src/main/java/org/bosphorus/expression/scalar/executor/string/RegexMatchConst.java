package org.bosphorus.expression.scalar.executor.string;

import java.util.regex.Pattern;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class RegexMatchConst<TInput> implements IScalarExecutor<TInput, Boolean> {

	private Pattern pattern;
	private IScalarExecutor<TInput, String> text;
	
	public RegexMatchConst(String pattern, IScalarExecutor<TInput, String> text) {
		this.pattern = Pattern.compile(pattern);
		this.text = text;
	}
	
	@Override
	public Boolean execute(TInput input) throws Exception {
		return pattern.matcher(text.execute(input)).matches();
	}

}
