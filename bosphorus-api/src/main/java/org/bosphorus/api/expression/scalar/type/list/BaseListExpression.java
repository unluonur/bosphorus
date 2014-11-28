package org.bosphorus.api.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.api.expression.scalar.type.BaseTypeExpression;
import org.bosphorus.api.expression.scalar.type.primitive.BasePrimitiveExpression;
import org.bosphorus.api.expression.scalar.type.primitive.IntegerExpression;

public abstract class BaseListExpression<TInput, TType extends Comparable<TType>, TPrimitiveType extends BasePrimitiveExpression<TInput, TType>> extends BaseTypeExpression<TInput, List<TType>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseListExpression(IScalarExpression<TInput, List<TType>> builder) {
		super(builder);
	}
	
	public IntegerExpression<TInput> length() {
		return null;
	}
	
	protected abstract TPrimitiveType create(IScalarExpression<TInput, TType> expression);
	
	public TType min() {
		return null;
	}

	public TType max() {
		return null;
	}
}
