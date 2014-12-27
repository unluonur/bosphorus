package org.bosphorus.expression.aggregate.factory.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.math.StdDevDoubleExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class StdDevDoubleFactory implements IAggregateExecutorFactory<Number, Double> {

	@Override
	public IAggregateExecutor<Number, Double> create() {
		return new StdDevDoubleExecutor();
	}

}
