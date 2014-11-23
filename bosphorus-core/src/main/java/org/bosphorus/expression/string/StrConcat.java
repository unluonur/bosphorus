package org.bosphorus.expression.string;

import java.util.ArrayList;
import org.bosphorus.expression.IExpression;

public class StrConcat<TInput> implements IExpression<TInput, String> {
	
	private ArrayList<IExpression<TInput, String>> list;

	@SafeVarargs
	public StrConcat(IExpression<TInput, String>... list) {
		this.list = new ArrayList<IExpression<TInput, String>>();
		for(IExpression<TInput, String> expr: list) {
			this.list.add(expr);
		}
	}

	@Override
	public String execute(TInput input) throws Exception {
		String result = "";
		for(IExpression<TInput, String> expr: list) {
			result += expr.execute(input);
		}
		return result;
	}

}
