package org.bosphorus.aggregation.bag;

import java.util.ArrayList;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class CountDistinctBag<TType extends Comparable<TType>> extends BaseAggregationBag<Integer, TType> {
	private ArrayList<TType> list;

	public CountDistinctBag(IExpression<TType> expression) {
		super(expression);
		list = new ArrayList<TType>();
	}

	@Override
	public void execute(ITuple input) throws Exception {
		TType value = this.getExpression().execute(input);
		if(!list.contains(value)) {
			list.add(value);
		}
	}

	@Override
	public Integer getValue() {
		return list.size();
	}

}
