package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.AvgDoubleExecutor;
import org.bosphorus.expression.batch.IBatchExecutor;

public class AvgDoubleFactory<TInput> implements IBatchExecutorFactory<Number, Double> {

	@Override
	public IBatchExecutor<Number, Double> create() {
		return new AvgDoubleExecutor();
	}
	
}
