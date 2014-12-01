package org.bosphorus.api.builder.expression.scalar;

import java.io.Serializable;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public interface IScalarExpression<TInput, TOutput> extends Serializable {
	
	IScalarExecutor<TInput, TOutput> build();
	
}
