package org.bosphorus.topology.node.builder;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.stream.IWriter;
import org.bosphorus.stream.pipe.FilterPipe;

public class FilterNode<TType> implements IReadWriteNodeBuilder<TType, TType> {
	IScalarExecutor<TType, Boolean> filter;

	@Override
	public List<IWriter<TType>> build(List<IWriter<TType>> outputs) {
		ArrayList<IWriter<TType>> result = new ArrayList<IWriter<TType>>();
		result.add(new FilterPipe<TType>(filter, outputs.get(0)));
		return result;
	}

}
