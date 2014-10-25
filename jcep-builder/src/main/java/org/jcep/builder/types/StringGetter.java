package org.jcep.builder.types;

import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.condition.LessThan;
import org.jcep.core.expressions.string.StrConcat;
import org.jcep.core.expressions.string.StrLength;

public class StringGetter<TContext> extends BaseTypeGetter<String, TContext> {

	public StringGetter(IExpression<String, TContext> expression) {
		super(expression);
	}
	
	public StringGetter<TContext> append(StringGetter<TContext> value) {
		return new StringGetter<TContext>(new StrConcat<TContext>(this.getExpression(), value.getExpression()));
	}
	
	public IntegerGetter<TContext> length() {
		return new IntegerGetter<TContext>(new StrLength<TContext>(this.getExpression()));
	}

}
