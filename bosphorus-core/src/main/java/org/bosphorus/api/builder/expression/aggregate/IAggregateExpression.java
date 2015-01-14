package org.bosphorus.api.builder.expression.aggregate;

import java.io.Serializable;

import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;

public interface IAggregateExpression<TInput, TOutput> extends Serializable {

	IAggregateExecutorFactory<TInput, TOutput> build();
	
}
