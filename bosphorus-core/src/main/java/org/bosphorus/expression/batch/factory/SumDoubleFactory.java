package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.IBatchExecutor;
import org.bosphorus.expression.batch.SumDoubleExecutor;

public class SumDoubleFactory implements IBatchExecutorFactory<Number, Double> {

	@Override
	public IBatchExecutor<Number, Double> create() {
		return new SumDoubleExecutor();
	}

}
