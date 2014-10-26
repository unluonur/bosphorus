package org.jcep.core.stream;

import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.condition.Not;
import org.jcep.core.statements.IStatement;
import org.jcep.core.statements.If;

public class FilterStatement<TInput> extends If<TInput> {
	public FilterStatement(IExpression<TInput, Boolean> condition, IStatement<TInput> output) {
		super(new Not<TInput>(condition), output, null);
	}
}
