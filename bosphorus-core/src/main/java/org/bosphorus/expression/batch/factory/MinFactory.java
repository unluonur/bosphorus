package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.IBatchExecutor;
import org.bosphorus.expression.batch.MinExecutor;

public class MinFactory<TType extends Comparable<TType>> implements IBatchExecutorFactory<TType, TType> {

	@Override
	public IBatchExecutor<TType, TType> create() {
		return new MinExecutor<TType>();
	}

}
