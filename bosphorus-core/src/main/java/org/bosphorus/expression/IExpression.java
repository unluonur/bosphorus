package org.bosphorus.expression;

public interface IExpression <TInput, TOutput> {
	
	TOutput execute(TInput input) throws Exception;
	
}
