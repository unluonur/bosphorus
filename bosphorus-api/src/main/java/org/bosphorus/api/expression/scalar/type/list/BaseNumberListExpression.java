package org.bosphorus.api.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.api.expression.scalar.type.primitive.BasePrimitiveExpression;
import org.bosphorus.api.expression.scalar.type.primitive.DoubleExpression;
import org.bosphorus.api.expression.scalar.type.primitive.FloatExpression;
import org.bosphorus.api.expression.scalar.type.primitive.IntegerExpression;
import org.bosphorus.api.expression.scalar.type.primitive.LongExpression;

public abstract class BaseNumberListExpression<TInput, TType extends Number & Comparable<TType>, TPrimitiveType extends BasePrimitiveExpression<TInput, TType>> extends BaseListExpression<TInput, TType, TPrimitiveType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseNumberListExpression(IScalarExpression<TInput, List<TType>> builder) {
		super(builder);
	}
	
	public IntegerExpression<TInput> sumInteger() {
		return null;
	}
	
	public LongExpression<TInput> sumLong() {
		return null;
	}
	
	public FloatExpression<TInput> sumFloat() {
		return null;
	}
	
	public DoubleExpression<TInput> sumDouble() {
		return null;
	}
	
	public IntegerExpression<TInput> avgInteger() {
		return null;
	}
	
	public LongExpression<TInput> avgLong() {
		return null;
	}
	
	public FloatExpression<TInput> avgFloat() {
		return null;
	}
	
	public DoubleExpression<TInput> avgDouble() {
		return null;
	}

}
