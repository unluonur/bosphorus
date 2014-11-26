package org.bosphorus.expression.scalar.list;

import java.util.List;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class ListLength<TInput> implements IScalarExecutor<TInput, Integer> {
	private IScalarExecutor<TInput, List<?>> list;

	@Override
	public Integer execute(TInput input) throws Exception {
		return list.execute(input).size();
	}

}
