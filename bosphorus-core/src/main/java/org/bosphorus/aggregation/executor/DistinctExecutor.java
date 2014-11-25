package org.bosphorus.aggregation.executor;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class DistinctExecutor<TInput, TType> implements IAggregationExecutor<TInput, List<TType>> {
	private IExpression<TInput, TType> expression;
	private ArrayList<TType> list;

	public DistinctExecutor(IExpression<TInput, TType> expression) {
		this.expression = expression;
		this.list = new ArrayList<TType>();
	}

	@Override
	public void execute(TInput input) throws Exception {
		TType value = expression.execute(input);
		if(!list.contains(value)) {
			list.add(value);
		}
	}

	@Override
	public List<TType> getValue() {
		return list;
	}

	@Override
	public void reset() {
		list.clear();
	}

}
