package org.bosphorus.expression.scalar.string;

import java.util.List;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class StrJoin<TInput> implements IScalarExecutor<TInput, String> {
	
	private IScalarExecutor<TInput, List<String>> list;
	private IScalarExecutor<TInput, String> delimeter;

	@Override
	public String execute(TInput input) throws Exception {
		return String.join(delimeter.execute(input), list.execute(input));
	}

}
