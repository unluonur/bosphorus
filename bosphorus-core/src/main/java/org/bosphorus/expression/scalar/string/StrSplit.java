package org.bosphorus.expression.scalar.string;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class StrSplit<TInput> implements IScalarExecutor<TInput, List<String>> {
	
	private IScalarExecutor<TInput, String> text;
	private IScalarExecutor<TInput, String> split;

	@Override
	public List<String> execute(TInput input) throws Exception {
		ArrayList<String> result = new ArrayList<String>();
		for(String s: text.execute(input).split(split.execute(input))){
			result.add(s);
		}
		return result;
	}

}
