package org.bosphorus.api.fluent.expression.scalar.type;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.BooleanExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public abstract class BaseTypeExpression<TInput, TOutput> implements IScalarExpression<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<TInput, TOutput> builder;
	
	public BaseTypeExpression(IScalarExpression<TInput, TOutput> builder) {
		this.setBuilder(builder);
	}

	public IScalarExpression<TInput, TOutput> getBuilder() {
		return builder;
	}

	public void setBuilder(IScalarExpression<TInput, TOutput> builder) {
		this.builder = builder;
	}
	
	@Override
	public IScalarExecutor<TInput, TOutput> build() {
		return getBuilder().build();
	}

	public BooleanExpression<TInput> isNull() {
		return null;
	}
	
	public BooleanExpression<TInput> isNotNull() {
		return null;
	}
}
