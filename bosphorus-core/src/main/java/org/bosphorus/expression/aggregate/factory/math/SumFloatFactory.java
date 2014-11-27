package org.bosphorus.expression.aggregate.factory.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.math.SumFloatExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class SumFloatFactory implements IAggregateExecutorFactory<Number, Float> {

	@Override
	public IAggregateExecutor<Number, Float> create() {
		return new SumFloatExecutor();
	}

}
