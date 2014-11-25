package org.bosphorus.expression.list;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class ExpressionList<TInput, TOutput> implements IExpression<TInput, List<TOutput>> {

	private List<IExpression<TInput, ? extends TOutput>> expressions;

	public ExpressionList(List<IExpression<TInput, ? extends TOutput>> expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public List<TOutput> execute(TInput input) throws Exception {
		ArrayList<TOutput> result = new ArrayList<TOutput>();
		for(IExpression<TInput, ? extends TOutput> expr: expressions) {
			result.add(expr.execute(input));
		}
		return result;
	}

}
