package org.bosphorus.api.fluent.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.BooleanExpression;

public class BooleanListExpression<TInput> extends BasePrimitiveListExpression<TInput, Boolean, BooleanExpression<TInput>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BooleanListExpression(
			IScalarExpression<TInput, List<? extends Boolean>> builder) {
		super(builder);
	}

	@Override
	protected BooleanExpression<TInput> create(
			IScalarExpression<TInput, Boolean> expression) {
		return new BooleanExpression<TInput>(expression);
	}

}
