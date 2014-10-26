package org.jcep.builder.types;

import org.jcep.core.expressions.IExpression;

public interface ITypeGetter<TInput, TOutput> {

	IExpression<TInput, TOutput> getExpression();
	
}
