package org.bosphorus.expression.aggregate.factory.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.math.AvgLongExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class AvgLongFactory implements IAggregateExecutorFactory<Number, Long> {

	@Override
	public IAggregateExecutor<Number, Long> create() {
		return new AvgLongExecutor();
	}

}
