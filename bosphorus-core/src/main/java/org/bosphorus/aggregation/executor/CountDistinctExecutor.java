package org.bosphorus.aggregation.executor;

import java.util.ArrayList;

import org.bosphorus.expression.IExpression;

public class CountDistinctExecutor<TInput, TType> implements IAggregationExecutor<TInput, Integer> {
	private IExpression<TInput, TType> expression;
	private ArrayList<Integer> list;

	public CountDistinctExecutor(IExpression<TInput, TType> expression) {
		this.expression = expression;
		this.list = new ArrayList<Integer>();
	}

	@Override
	public void execute(TInput input) throws Exception {
		TType value = this.expression.execute(input);
		Integer hashCode = value.hashCode();
		if(!list.contains(hashCode)) {
			list.add(hashCode);
		}
	}

	@Override
	public Integer getValue() {
		return list.size();
	}

	@Override
	public void reset() {
		list.clear();
	}

}
