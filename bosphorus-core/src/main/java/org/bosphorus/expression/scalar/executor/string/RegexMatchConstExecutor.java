package org.bosphorus.expression.scalar.executor.string;

import java.util.regex.Pattern;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class RegexMatchConstExecutor<TInput> implements IScalarExecutor<TInput, Boolean> {

	private Pattern pattern;
	private IScalarExecutor<? super TInput, String> text;
	
	public RegexMatchConstExecutor(String pattern, IScalarExecutor<? super TInput, String> text) {
		this.pattern = Pattern.compile(pattern);
		this.text = text;
	}
	
	@Override
	public Boolean execute(TInput input) throws Exception {
		return pattern.matcher(text.execute(input)).matches();
	}

}
