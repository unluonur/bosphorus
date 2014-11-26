package org.bosphorus.expression.scalar.list;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class ExpressionList<TInput, TOutput> implements IScalarExecutor<TInput, List<TOutput>> {

	private List<IScalarExecutor<TInput, ? extends TOutput>> expressions;

	public ExpressionList(List<IScalarExecutor<TInput, ? extends TOutput>> expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public List<TOutput> execute(TInput input) throws Exception {
		ArrayList<TOutput> result = new ArrayList<TOutput>();
		for(IScalarExecutor<TInput, ? extends TOutput> expr: expressions) {
			result.add(expr.execute(input));
		}
		return result;
	}

}
