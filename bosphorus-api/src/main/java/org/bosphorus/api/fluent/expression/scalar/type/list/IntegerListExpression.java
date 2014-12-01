package org.bosphorus.api.fluent.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.IntegerExpression;

public class IntegerListExpression<TInput> extends BaseNumberListExpression<TInput, Integer, IntegerExpression<TInput>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerListExpression(
			IScalarExpression<TInput, List<? extends Integer>> builder) {
		super(builder);
	}

	@Override
	protected IntegerExpression<TInput> create(
			IScalarExpression<TInput, Integer> expression) {
		return new IntegerExpression<TInput>(expression);
	}

}
