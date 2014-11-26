package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.AvgLongExecutor;
import org.bosphorus.expression.batch.IBatchExecutor;

public class AvgLongFactory implements IBatchExecutorFactory<Number, Long> {

	@Override
	public IBatchExecutor<Number, Long> create() {
		return new AvgLongExecutor();
	}

}
