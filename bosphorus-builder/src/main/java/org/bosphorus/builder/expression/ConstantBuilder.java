package org.bosphorus.builder.expression;

import org.bosphorus.expression.Constant;
import org.bosphorus.expression.IExpression;

public class ConstantBuilder<TInput, TOutput> implements IExpressionBuilder<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TOutput value;

	@Override
	public String serialize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IExpression<TInput, TOutput> build() {
		return new Constant<TInput, TOutput>(value);
	}

}
