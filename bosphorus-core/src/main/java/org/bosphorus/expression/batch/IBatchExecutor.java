package org.bosphorus.expression.batch;

public interface IBatchExecutor<TInput, TOutput> {

	void execute(TInput input) throws Exception;
	TOutput getValue();
	void reset();
	Object getState();
	void setState(Object state);

}
