package org.bosphorus.builder.container;

import org.bosphorus.expression.IExpression;

public interface ITypeContainer<TOutput> {

	IExpression<TOutput> getExpression();
	
}
