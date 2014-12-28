package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.string.StrConcatExecutor;
import org.bosphorus.expression.scalar.executor.string.StrLengthExecutor;

public class StringContainer<TInput> extends BaseComparableContainer<TInput, String> {

	public StringContainer(IScalarExecutor<TInput, String> expression) {
		super(expression);
	}
	
	public StringContainer<TInput> append(StringContainer<TInput> value) {
		return new StringContainer<TInput>(new StrConcatExecutor<TInput>(this.getExpression(), value.getExpression()));
	}
	
	public IntegerContainer<TInput> length() {
		return new IntegerContainer<TInput>(new StrLengthExecutor<TInput>(this.getExpression()));
	}

}
