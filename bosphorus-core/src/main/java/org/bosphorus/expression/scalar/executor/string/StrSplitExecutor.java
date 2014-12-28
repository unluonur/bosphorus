package org.bosphorus.expression.scalar.executor.string;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class StrSplitExecutor<TInput> implements IScalarExecutor<TInput, List<String>> {
	
	private IScalarExecutor<? super TInput, String> text;
	private IScalarExecutor<? super TInput, String> split;

	@Override
	public List<String> execute(TInput input) throws Exception {
		ArrayList<String> result = new ArrayList<String>();
		for(String s: text.execute(input).split(split.execute(input))){
			result.add(s);
		}
		return result;
	}

}
