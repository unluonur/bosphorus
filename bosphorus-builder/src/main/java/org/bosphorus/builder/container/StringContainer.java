package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.string.StrConcat;
import org.bosphorus.expression.scalar.executor.string.StrLength;

public class StringContainer<TInput> extends BaseComparableContainer<TInput, String> {

	public StringContainer(IScalarExecutor<TInput, String> expression) {
		super(expression);
	}
	
	public StringContainer<TInput> append(StringContainer<TInput> value) {
		return new StringContainer<TInput>(new StrConcat<TInput>(this.getExpression(), value.getExpression()));
	}
	
	public IntegerContainer<TInput> length() {
		return new IntegerContainer<TInput>(new StrLength<TInput>(this.getExpression()));
	}

}
