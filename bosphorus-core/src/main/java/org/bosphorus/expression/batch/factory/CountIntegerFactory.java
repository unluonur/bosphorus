package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.CountIntegerExecutor;
import org.bosphorus.expression.batch.IBatchExecutor;

public class CountIntegerFactory implements IBatchExecutorFactory<Object, Integer> {

	@Override
	public IBatchExecutor<Object, Integer> create() {
		return new CountIntegerExecutor();
	}
	
}
