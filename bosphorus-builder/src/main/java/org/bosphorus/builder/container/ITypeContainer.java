package org.bosphorus.builder.container;

import org.bosphorus.core.expression.IExpression;

public interface ITypeContainer<TInput, TOutput> {

	IExpression<TInput, TOutput> getExpression();
	
}
