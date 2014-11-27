package org.bosphorus.builder.expression;

import org.bosphorus.builder.IBuilder;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public interface IExpressionBuilder<TInput, TOutput> extends IBuilder
{
	IScalarExecutor<TInput, TOutput> build();
	
}
