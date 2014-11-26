package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.IBatchExecutor;
import org.bosphorus.expression.batch.SumFloatExecutor;

public class SumFloatFactory implements IBatchExecutorFactory<Number, Float> {

	@Override
	public IBatchExecutor<Number, Float> create() {
		return new SumFloatExecutor();
	}

}
