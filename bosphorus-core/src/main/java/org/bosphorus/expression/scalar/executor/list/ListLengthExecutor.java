package org.bosphorus.expression.scalar.executor.list;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ListLengthExecutor<TInput> implements IScalarExecutor<TInput, Integer> {
	private IScalarExecutor<? super TInput, ? extends List<?>> list;

	@Override
	public Integer execute(TInput input) throws Exception {
		return list.execute(input).size();
	}

}
