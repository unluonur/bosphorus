package org.bosphorus.expression.scalar.executor.string;

import java.util.regex.Pattern;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class RegexMatch<TInput> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<? super TInput, String> pattern;
	private IScalarExecutor<? super TInput, String> text;
	
	@Override
	public Boolean execute(TInput input) throws Exception {
		Pattern p = Pattern.compile(pattern.execute(input));
		return p.matcher(text.execute(input)).matches();
	}

}
