package org.jcep.builder.types;

import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.string.StrConcat;
import org.jcep.core.expressions.string.StrLength;

public class StringContainer<TInput> extends BaseComparableContainer<TInput, String> {

	public StringContainer(IExpression<TInput, String> expression) {
		super(expression);
	}
	
	public StringContainer<TInput> append(StringContainer<TInput> value) {
		return new StringContainer<TInput>(new StrConcat<TInput>(this.getExpression(), value.getExpression()));
	}
	
	public IntegerContainer<TInput> length() {
		return new IntegerContainer<TInput>(new StrLength<TInput>(this.getExpression()));
	}

}
