package org.bosphorus.expression.scalar.executor.condition;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class NotInExecutor<TInput, TType extends Comparable<TType>> extends BaseListComparisonExecutor<TInput, TType> {

	public NotInExecutor(IScalarExecutor<TInput, TType> value,
			IScalarExecutor<TInput, List<TType>> list) {
		super(value, list);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return !this.getList().execute(input).contains(this.getValue().execute(input));
	}

}
