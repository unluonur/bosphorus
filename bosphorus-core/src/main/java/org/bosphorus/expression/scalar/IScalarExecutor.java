package org.bosphorus.expression.scalar;

public interface IScalarExecutor <TInput, TOutput> {
	
	TOutput execute(TInput input) throws Exception;
	
}
