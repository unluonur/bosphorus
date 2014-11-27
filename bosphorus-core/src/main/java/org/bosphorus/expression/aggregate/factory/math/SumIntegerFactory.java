package org.bosphorus.expression.aggregate.factory.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.math.SumIntegerExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class SumIntegerFactory<TInput> implements IAggregateExecutorFactory<Number, Integer> {

	@Override
	public IAggregateExecutor<Number, Integer> create() {
		return new SumIntegerExecutor();
	}

}
