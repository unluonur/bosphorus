package org.bosphorus.api.builder.expression.scalar;

import java.io.Serializable;

import org.bosphorus.expression.scalar.executor.IScalarExecutor1;

public interface IScalarExpression1<TInput, TOutput> extends Serializable {
	
	IScalarExecutor1<TInput, TOutput> build();
	
}
