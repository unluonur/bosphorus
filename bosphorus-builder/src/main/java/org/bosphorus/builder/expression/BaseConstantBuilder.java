package org.bosphorus.builder.expression;

import org.bosphorus.expression.Constant;
import org.bosphorus.expression.IExpression;

public abstract class BaseConstantBuilder<TInput, TOutput> implements IExpressionBuilder<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TOutput value;

	public TOutput getValue() {
		return value;
	}

	public void setValue(TOutput value) {
		this.value = value;
	}

	@Override
	public IExpression<TInput, TOutput> build() {
		return new Constant<TInput, TOutput>(this.getValue());
	}

}
