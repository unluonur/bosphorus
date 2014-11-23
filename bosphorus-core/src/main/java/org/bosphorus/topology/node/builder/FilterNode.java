package org.bosphorus.topology.node.builder;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.pipe.Filter;
import org.bosphorus.stream.pipe.IPipe;

public class FilterNode<TType> implements IReadWriteNodeBuilder<TType, TType> {
	IExpression<TType, Boolean> filter;

	@Override
	public List<IPipe<TType>> build(List<IPipe<TType>> outputs) {
		ArrayList<IPipe<TType>> result = new ArrayList<IPipe<TType>>();
		result.add(new Filter<TType>(filter, outputs.get(0)));
		return result;
	}

}
