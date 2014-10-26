package org.jcep.builder.types;

import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.condition.LessThan;
import org.jcep.core.expressions.string.StrConcat;
import org.jcep.core.expressions.string.StrLength;

public class StringGetter<TInput> extends BaseTypeGetter<TInput, String> {

	public StringGetter(IExpression<TInput, String> expression) {
		super(expression);
	}
	
	public StringGetter<TInput> append(StringGetter<TInput> value) {
		return new StringGetter<TInput>(new StrConcat<TInput>(this.getExpression(), value.getExpression()));
	}
	
	public IntegerGetter<TInput> length() {
		return new IntegerGetter<TInput>(new StrLength<TInput>(this.getExpression()));
	}

}
