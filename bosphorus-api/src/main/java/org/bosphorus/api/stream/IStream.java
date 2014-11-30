package org.bosphorus.api.stream;

import org.bosphorus.api.expression.scalar.IScalarExpression;

public interface IStream<TInput, TOutput> {
	IScalarExpression<TInput, TOutput> getProjection();
	
	IScalarExpression<TInput, Boolean> getFilter();
}
