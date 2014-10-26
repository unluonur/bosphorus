package org.bosphorus.core.stream;

import org.bosphorus.core.expressions.IExpression;
import org.bosphorus.core.expressions.condition.Not;
import org.bosphorus.core.statements.IStatement;
import org.bosphorus.core.statements.If;

public class FilterStatement<TInput> extends If<TInput> {
	public FilterStatement(IExpression<TInput, Boolean> condition, IStatement<TInput> output) {
		super(new Not<TInput>(condition), output, null);
	}
}
