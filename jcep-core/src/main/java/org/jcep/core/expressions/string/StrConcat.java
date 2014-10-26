package org.jcep.core.expressions.string;

import java.util.ArrayList;

import org.jcep.core.expressions.IExpression;

public class StrConcat<TInput> implements IExpression<TInput, String> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5125076452642910217L;
	
	private ArrayList<IExpression<TInput, String>> list;
	
	public StrConcat() {
		this.setList(new ArrayList<IExpression<TInput, String>>());
	}
	
	@SafeVarargs
	public StrConcat(IExpression<TInput, String>... list) {
		this();
		for(IExpression<TInput, String> expr: list) {
			this.getList().add(expr);
		}
	}

	public ArrayList<IExpression<TInput, String>> getList() {
		return list;
	}

	public void setList(ArrayList<IExpression<TInput, String>> list) {
		this.list = list;
	}

	@Override
	public String execute(TInput input) {
		String result = "";
		for(IExpression<TInput, String> expr: this.getList()) {
			result += expr.execute(input);
		}
		return result;
	}

}
