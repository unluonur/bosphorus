package org.bosphorus.api.fluent.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.LongExpression;

public class LongListExpression<TInput> extends BaseNumberListExpression<TInput, Long, LongExpression<TInput>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LongListExpression(
			IScalarExpression<TInput, List<? extends Long>> builder) {
		super(builder);
	}

	@Override
	protected LongExpression<TInput> create(
			IScalarExpression<TInput, Long> expression) {
		return new LongExpression<TInput>(expression);
	}

}
