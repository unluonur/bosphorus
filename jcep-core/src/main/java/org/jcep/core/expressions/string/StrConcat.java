package org.jcep.core.expressions.string;

import java.util.ArrayList;

import org.jcep.core.expressions.common.IExpression;

public class StrConcat<TContext> implements IExpression<String, TContext> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5125076452642910217L;
	
	private ArrayList<IExpression<String, TContext>> list;
	
	public StrConcat() {
		this.setList(new ArrayList<IExpression<String,TContext>>());
	}
	
	public StrConcat(IExpression<String, TContext>... list) {
		this();
		for(IExpression<String, TContext> expr: list) {
			this.getList().add(expr);
		}
	}

	public ArrayList<IExpression<String, TContext>> getList() {
		return list;
	}

	public void setList(ArrayList<IExpression<String, TContext>> list) {
		this.list = list;
	}

	@Override
	public String execute(TContext context) {
		String result = "";
		for(IExpression<String, TContext> expr: this.getList()) {
			result += expr.execute(context);
		}
		return result;
	}

}
