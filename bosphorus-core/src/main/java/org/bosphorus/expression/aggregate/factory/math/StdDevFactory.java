package org.bosphorus.expression.aggregate.factory.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.math.StdDevExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class StdDevFactory implements IAggregateExecutorFactory<Number, Double> {

	@Override
	public IAggregateExecutor<Number, Double> create() {
		return new StdDevExecutor();
	}

}
