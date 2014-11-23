package org.bosphorus.expression.list;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class ListProjection<TInput> implements IExpression<TInput, List<Object>> {

	private List<IExpression<TInput, ?>> expressions;

	public ListProjection(List<IExpression<TInput, ?>> expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public List<Object> execute(TInput input) throws Exception {
		ArrayList<Object> result = new ArrayList<Object>();
		for(IExpression<TInput, ?> expr: expressions) {
			result.add(expr.execute(input));
		}
		return result;
	}

}
