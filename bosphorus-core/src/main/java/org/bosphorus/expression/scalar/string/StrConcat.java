package org.bosphorus.expression.scalar.string;

import java.util.ArrayList;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class StrConcat<TInput> implements IScalarExecutor<TInput, String> {
	
	private ArrayList<IScalarExecutor<TInput, String>> list;

	@SafeVarargs
	public StrConcat(IScalarExecutor<TInput, String>... list) {
		this.list = new ArrayList<IScalarExecutor<TInput, String>>();
		for(IScalarExecutor<TInput, String> expr: list) {
			this.list.add(expr);
		}
	}

	@Override
	public String execute(TInput input) throws Exception {
		String result = "";
		for(IScalarExecutor<TInput, String> expr: list) {
			result += expr.execute(input);
		}
		return result;
	}

}
