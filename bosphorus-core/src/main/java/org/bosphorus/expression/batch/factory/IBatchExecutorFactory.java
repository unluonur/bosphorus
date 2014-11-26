package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.IBatchExecutor;

public interface IBatchExecutorFactory<TInput, TOutput> {

	IBatchExecutor<TInput, TOutput> create();
	
}
