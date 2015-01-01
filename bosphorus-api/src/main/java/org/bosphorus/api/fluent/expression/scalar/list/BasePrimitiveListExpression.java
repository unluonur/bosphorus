package org.bosphorus.api.fluent.expression.scalar.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.BaseComparableExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.IntegerExpression;

public abstract class BasePrimitiveListExpression<TInput, TType extends Comparable<TType>, TPrimitiveType extends BaseComparableExpression<TInput, TType>> extends BaseListExpression<TInput, TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BasePrimitiveListExpression(IScalarExpression<TInput, ? extends List<? extends TType>> builder) {
		super(builder);
	}
	
	protected abstract TPrimitiveType create(IScalarExpression<TInput, TType> expression);
	
	public IntegerExpression<TInput> length() {
		return null;
	}

}
