package org.bosphorus.expression.aggregate.factory.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.math.AvgIntegerExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class AvgIntegerFactory implements IAggregateExecutorFactory<Number, Integer> {

	@Override
	public IAggregateExecutor<Number, Integer> create() {
		return new AvgIntegerExecutor();
	}

}
