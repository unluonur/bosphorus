package org.bosphorus.aggregation.executor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class LastNExecutor<TInput, TType> implements IAggregationExecutor<TInput, List<TType>> {
	private IExpression<TInput, TType> expression;
	private LinkedList<TType> list;
	private Integer maxSize;
	
	public LastNExecutor(IExpression<TInput, TType> expression, Integer maxSize) {
		this.expression = expression;
		this.maxSize = maxSize;
		this.list = new LinkedList<TType>();
	}

	@Override
	public void execute(TInput input) throws Exception {
		list.add(expression.execute(input));
		while(list.size() > maxSize) {
			list.poll();
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
