package org.bosphorus.statement;

import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.condition.Not;

public class Filter extends If {
	public Filter(IExpression<Boolean> condition, IStatement output) {
		super(new Not(condition), output, null);
	}
}
