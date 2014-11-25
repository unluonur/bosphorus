package org.bosphorus.aggregation.executor;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class FirstNExecutor<TInput, TType> implements IAggregationExecutor<TInput, List<TType>> {
	private IExpression<TInput, TType> expression;
	private ArrayList<TType> list;
	private Integer maxSize;
	
	public FirstNExecutor(IExpression<TInput, TType> expression, Integer maxSize) {
		this.expression = expression;
		this.maxSize = maxSize;
		this.list = new ArrayList<TType>();
	}

	@Override
	public void execute(TInput input) throws Exception {
		if(list.size()<maxSize) {
			list.add(expression.execute(input));
		}
	}

	@Override
	public List<TType> getValue() {
		return new ArrayList<TType>(list);
	}

	@Override
	public void reset() {
		list.clear();
	}

}
