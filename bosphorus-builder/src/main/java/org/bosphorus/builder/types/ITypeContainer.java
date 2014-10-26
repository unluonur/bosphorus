package org.bosphorus.builder.types;

import org.bosphorus.core.expressions.IExpression;

public interface ITypeContainer<TInput, TOutput> {

	IExpression<TInput, TOutput> getExpression();
	
}
