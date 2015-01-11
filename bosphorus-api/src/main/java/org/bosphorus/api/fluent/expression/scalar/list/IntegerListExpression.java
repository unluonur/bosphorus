package org.bosphorus.api.fluent.expression.scalar.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.fluent.expression.scalar.primitive.IntegerExpression;

public class IntegerListExpression<TInput> extends BaseNumberListExpression<TInput, Integer, IntegerExpression<TInput>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerListExpression(
			IScalarExpression1<TInput, List<? extends Integer>> builder) {
		super(builder);
	}

	@Override
	protected IntegerExpression<TInput> create(
			IScalarExpression1<TInput, Integer> expression) {
		return new IntegerExpression<TInput>(expression);
	}
	
	public IntegerExpression<TInput> sum() {
		return this.sumInteger();
	}
	
}
