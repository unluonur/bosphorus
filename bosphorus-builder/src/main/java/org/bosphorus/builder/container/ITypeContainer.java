package org.bosphorus.builder.container;

import org.bosphorus.expression.IExpression;

public interface ITypeContainer<TInput, TOutput> {

	IExpression<TInput, TOutput> getExpression();
	
}
