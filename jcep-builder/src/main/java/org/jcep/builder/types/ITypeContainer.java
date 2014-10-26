package org.jcep.builder.types;

import org.jcep.core.expressions.IExpression;

public interface ITypeContainer<TInput, TOutput> {

	IExpression<TInput, TOutput> getExpression();
	
}
