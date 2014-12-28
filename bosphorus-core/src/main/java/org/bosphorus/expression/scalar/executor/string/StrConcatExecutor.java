package org.bosphorus.expression.scalar.executor.string;

import java.util.ArrayList;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class StrConcatExecutor<TInput> implements IScalarExecutor<TInput, String> {
	
	private ArrayList<IScalarExecutor<? super TInput, String>> list;

	@SafeVarargs
	public StrConcatExecutor(IScalarExecutor<? super TInput, String>... list) {
		this.list = new ArrayList<IScalarExecutor<? super TInput, String>>();
		for(IScalarExecutor<? super TInput, String> expr: list) {
			this.list.add(expr);
		}
	}

	@Override
	public String execute(TInput input) throws Exception {
		String result = "";
		for(IScalarExecutor<? super TInput, String> expr: list) {
			result += expr.execute(input);
		}
		return result;
	}

}
