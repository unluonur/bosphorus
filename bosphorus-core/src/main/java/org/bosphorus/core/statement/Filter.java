package org.bosphorus.core.statement;

import org.bosphorus.core.expression.IExpression;
import org.bosphorus.core.expression.condition.Not;

public class Filter<TInput> extends If<TInput> {
	public Filter(IExpression<TInput, Boolean> condition, IStatement<TInput> output) {
		super(new Not<TInput>(condition), output, null);
	}
}
