package org.bosphorus.builder.expression;

import org.bosphorus.builder.IBuilder;
import org.bosphorus.expression.IExpression;

public interface IExpressionBuilder<TInput, TOutput> extends IBuilder
{
	IExpression<TInput, TOutput> build();
	
}
