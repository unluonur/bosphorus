package org.bosphorus.statement;

import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.condition.Not;

public class Filter<TInput> extends If<TInput> {
	public Filter(IExpression<TInput, Boolean> condition, IStatement output) {
		super(new Not<TInput>(condition), output, null);
	}
}
