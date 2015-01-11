package org.bosphorus.api.fluent.expression.scalar;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.builder.expression.scalar.common.ConvertExpression;
import org.bosphorus.api.builder.expression.scalar.event.ScalarExpression1;
import org.bosphorus.api.fluent.expression.scalar.primitive.BooleanExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.expression.scalar.factory.IScalarExecutorFactory1;

public abstract class BaseTypeExpression<TInput, TOutput> implements IScalarExpression1<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression1<TInput, TOutput> builder;
	
	public BaseTypeExpression(IScalarExpression1<TInput, TOutput> builder) {
		this.setBuilder(builder);
	}

	public IScalarExpression1<TInput, TOutput> getBuilder() {
		return builder;
	}

	public void setBuilder(IScalarExpression1<TInput, TOutput> builder) {
		this.builder = builder;
	}
	
	@Override
	public IScalarExecutorFactory1<TInput, TOutput> build() {
		return getBuilder().build();
	}

	public BooleanExpression<TInput> isNull() {
		return null;
	}
	
	public BooleanExpression<TInput> isNotNull() {
		return null;
	}
	
	public <TType> IScalarExpression1<TInput, TType> convert() {
		return new ScalarExpression1<TInput, TType, TOutput>(new ConvertExpression<TOutput, TType>(), this);
	}
	
}
