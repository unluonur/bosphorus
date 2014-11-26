package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.CountLongExecutor;
import org.bosphorus.expression.batch.IBatchExecutor;

public class CountLongFactory implements IBatchExecutorFactory<Object, Long> {

	@Override
	public IBatchExecutor<Object, Long> create() {
		return new CountLongExecutor();
	}
	
}
