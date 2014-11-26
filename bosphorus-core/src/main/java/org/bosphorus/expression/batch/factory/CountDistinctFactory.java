package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.CountDistinctExecutor;
import org.bosphorus.expression.batch.IBatchExecutor;

public class CountDistinctFactory<TType extends Comparable<TType>> implements IBatchExecutorFactory<TType, Integer> {

	@Override
	public IBatchExecutor<TType, Integer> create() {
		return new CountDistinctExecutor<TType>();
	}

}
