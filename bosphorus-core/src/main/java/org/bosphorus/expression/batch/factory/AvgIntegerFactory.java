package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.AvgIntegerExecutor;
import org.bosphorus.expression.batch.IBatchExecutor;

public class AvgIntegerFactory implements IBatchExecutorFactory<Number, Integer> {

	@Override
	public IBatchExecutor<Number, Integer> create() {
		return new AvgIntegerExecutor();
	}

}
