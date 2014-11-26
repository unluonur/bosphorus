package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.IBatchExecutor;
import org.bosphorus.expression.batch.SumIntegerExecutor;

public class SumIntegerFactory<TInput> implements IBatchExecutorFactory<Number, Integer> {

	@Override
	public IBatchExecutor<Number, Integer> create() {
		return new SumIntegerExecutor();
	}

}
