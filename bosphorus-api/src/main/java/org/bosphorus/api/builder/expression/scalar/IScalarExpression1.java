package org.bosphorus.api.builder.expression.scalar;

import java.io.Serializable;

import org.bosphorus.expression.scalar.factory.IScalarExecutorFactory1;

public interface IScalarExpression1<TInput, TOutput> extends Serializable {
	
	IScalarExecutorFactory1<TInput, TOutput> build();
	
}
