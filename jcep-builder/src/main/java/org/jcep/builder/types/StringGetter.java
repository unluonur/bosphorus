package org.jcep.builder.types;

import org.jcep.core.expressions.common.IExpression;
import org.jcep.core.expressions.condition.LessThan;
import org.jcep.core.expressions.string.StrLength;

public class StringGetter<TContext> extends BaseTypeGetter<String, TContext> {

	public StringGetter(IExpression<String, TContext> expression) {
		super(expression);
	}
	
	public StringGetter<TContext> concat(StringGetter<TContext>... expressions) {
		return null;
	}
	
	public IntegerGetter<TContext> length(StringGetter<TContext> value) {
		return new IntegerGetter<TContext>(new StrLength<TContext>(value.getExpression()));
	}

}
