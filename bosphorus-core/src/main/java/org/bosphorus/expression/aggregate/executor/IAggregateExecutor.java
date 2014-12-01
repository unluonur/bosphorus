package org.bosphorus.expression.aggregate.executor;

import org.bosphorus.expression.IStateExpression;

public interface IAggregateExecutor<TInput, TOutput> extends IStateExpression {

	void execute(TInput input) throws Exception;
	TOutput getValue();

}
