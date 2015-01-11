package org.bosphorus.api.fluent.expression.scalar.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.fluent.expression.scalar.primitive.LongExpression;

public class LongListExpression<TInput> extends BaseNumberListExpression<TInput, Long, LongExpression<TInput>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LongListExpression(
			IScalarExpression1<TInput, List<Long>> builder) {
		super(builder);
	}

	@Override
	protected LongExpression<TInput> create(
			IScalarExpression1<TInput, Long> expression) {
		return new LongExpression<TInput>(expression);
	}
	
	public LongExpression<TInput> sum() {
		return this.sumLong();
	}

}
