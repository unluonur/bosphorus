package org.bosphorus.expression.aggregate.factory.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.math.SumLongExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class SumLongFactory<TInput> implements IAggregateExecutorFactory<Number, Long> {

	@Override
	public IAggregateExecutor<Number, Long> create() {
		return new SumLongExecutor();
	}

}
