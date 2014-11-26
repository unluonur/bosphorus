package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.AvgFloatExecutor;
import org.bosphorus.expression.batch.IBatchExecutor;

public class AvgFloatFactory implements IBatchExecutorFactory<Number, Float> {

	@Override
	public IBatchExecutor<Number, Float> create() {
		return new AvgFloatExecutor();
	}

}
