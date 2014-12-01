package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;

public interface IStream<TInput, TOutput> {
	IScalarExpression<TInput, TOutput> getProjection();
	
	IScalarExpression<TInput, Boolean> getFilter();
}
