package org.bosphorus.core.stream;

// TODO maybe IExpression can be used instead of this
public interface IPipe<TInput, TOutput> {
	TOutput execute(TInput input) throws Exception;
}
