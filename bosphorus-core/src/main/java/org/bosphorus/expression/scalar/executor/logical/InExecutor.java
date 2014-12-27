package org.bosphorus.expression.scalar.executor.logical;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class InExecutor<TInput, TType extends Comparable<TType>> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<? super TInput, ? extends TType> value;
	private IScalarExecutor<? super TInput, ? extends List<? extends TType>> list;

	public InExecutor(IScalarExecutor<? super TInput, ? extends TType> value,
			IScalarExecutor<? super TInput, ? extends List<? extends TType>> list) {
		this.value = value;
		this.list = list;
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return list.execute(input).contains(value.execute(input));
	}

}
