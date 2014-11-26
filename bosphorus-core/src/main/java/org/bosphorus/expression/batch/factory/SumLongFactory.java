package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.IBatchExecutor;
import org.bosphorus.expression.batch.SumLongExecutor;

public class SumLongFactory<TInput> implements IBatchExecutorFactory<Number, Long> {

	@Override
	public IBatchExecutor<Number, Long> create() {
		return new SumLongExecutor();
	}

}
