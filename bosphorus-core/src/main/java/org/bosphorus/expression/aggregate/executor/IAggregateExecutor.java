package org.bosphorus.expression.aggregate.executor;

public interface IAggregateExecutor<TInput, TOutput> {

	void execute(TInput input) throws Exception;
	TOutput getValue();
	void reset();
	Object getState();
	void setState(Object state) throws Exception;

}
