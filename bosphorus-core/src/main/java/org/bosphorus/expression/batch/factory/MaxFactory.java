package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.IBatchExecutor;
import org.bosphorus.expression.batch.MaxExecutor;

public class MaxFactory<TType extends Comparable<TType>> implements IBatchExecutorFactory<TType, TType> {

	@Override
	public IBatchExecutor<TType, TType> create() {
		return new MaxExecutor<TType>();
	}

}
