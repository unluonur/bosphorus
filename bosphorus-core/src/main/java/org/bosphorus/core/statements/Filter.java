package org.bosphorus.core.statements;

import org.bosphorus.core.expressions.IExpression;
import org.bosphorus.core.expressions.conditions.Not;

public class Filter<TInput> extends If<TInput> {
	public Filter(IExpression<TInput, Boolean> condition, IStatement<TInput> output) {
		super(new Not<TInput>(condition), output, null);
	}
}
