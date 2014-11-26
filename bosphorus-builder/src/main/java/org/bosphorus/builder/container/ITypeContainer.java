package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.IScalarExecutor;

public interface ITypeContainer<TInput, TOutput> {

	IScalarExecutor<TInput, TOutput> getExpression();
	
}
