package org.bosphorus.expression.scalar.executor.list;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ExpressionListExecutor<TInput, TOutput> implements IScalarExecutor<TInput, List<TOutput>> {

	private List<? extends IScalarExecutor<? super TInput, ? extends TOutput>> expressions;

	public ExpressionListExecutor(List<? extends IScalarExecutor<? super TInput, ? extends TOutput>> expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public List<TOutput> execute(TInput input) throws Exception {
		ArrayList<TOutput> result = new ArrayList<TOutput>();
		for(IScalarExecutor<? super TInput, ? extends TOutput> expr: expressions) {
			result.add(expr.execute(input));
		}
		return result;
	}

}
