package org.bosphorus.expression.scalar.condition;

import java.util.List;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class NotIn<TInput, TType extends Comparable<TType>> extends BaseListComparison<TInput, TType> {

	public NotIn(IScalarExecutor<TInput, TType> value,
			IScalarExecutor<TInput, List<TType>> list) {
		super(value, list);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return !this.getList().execute(input).contains(this.getValue().execute(input));
	}

}
