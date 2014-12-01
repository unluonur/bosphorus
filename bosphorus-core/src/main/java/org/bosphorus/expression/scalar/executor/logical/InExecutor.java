package org.bosphorus.expression.scalar.executor.logical;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class InExecutor<TInput, TType extends Comparable<TType>> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<TInput, TType> value;
	private IScalarExecutor<TInput, List<TType>> list;

	public InExecutor(IScalarExecutor<TInput, TType> value,
			IScalarExecutor<TInput, List<TType>> list) {
		this.value = value;
		this.list = list;
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return list.execute(input).contains(value.execute(input));
	}

}
