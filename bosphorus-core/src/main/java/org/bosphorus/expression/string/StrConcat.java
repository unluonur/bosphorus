package org.bosphorus.expression.string;

import java.util.ArrayList;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class StrConcat implements IExpression<String> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5125076452642910217L;
	
	private ArrayList<IExpression<String>> list;
	
	public StrConcat() {
		this.setList(new ArrayList<IExpression<String>>());
	}
	
	@SafeVarargs
	public StrConcat(IExpression<String>... list) {
		this();
		for(IExpression<String> expr: list) {
			this.getList().add(expr);
		}
	}

	public ArrayList<IExpression<String>> getList() {
		return list;
	}

	public void setList(ArrayList<IExpression<String>> list) {
		this.list = list;
	}

	@Override
	public String execute(ITuple input) throws Exception {
		String result = "";
		for(IExpression<String> expr: this.getList()) {
			result += expr.execute(input);
		}
		return result;
	}

}
