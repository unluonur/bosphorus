package org.bosphorus.expression.scalar.executor;

public interface IScalarExecutor <TInput, TOutput> {

	TOutput execute(TInput input) throws Exception;

}
