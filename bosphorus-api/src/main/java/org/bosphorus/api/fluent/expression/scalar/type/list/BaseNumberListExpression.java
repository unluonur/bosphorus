package org.bosphorus.api.fluent.expression.scalar.type.list;

import java.util.Date;
import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.common.MinExpression;
import org.bosphorus.api.builder.expression.aggregate.math.SumIntegerExpression;
import org.bosphorus.api.builder.expression.aggregate.math.SumLongExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.builder.expression.scalar.aggregate.ListAggregateExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.BasePrimitiveExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.DateExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.DoubleExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.FloatExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.IntegerExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.LongExpression;

public abstract class BaseNumberListExpression<TInput, TType extends Number & Comparable<TType>, TPrimitiveType extends BasePrimitiveExpression<TInput, TType>> extends BasePrimitiveListExpression<TInput, TType, TPrimitiveType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseNumberListExpression(IScalarExpression<TInput, List<? extends TType>> builder) {
		super(builder);
	}
	
	public IntegerExpression<TInput> sumInteger() {
		return null;
		//IScalarExpression<TInput, Integer> expr = new ListAggregateExpression<TInput, Integer, Integer>(this, null);
		//this.<Integer>aggregate(null);
		//return new IntegerExpression<TInput>(this.<Integer>aggregate(new SumIntegerExpression()));
	}
	
	public LongExpression<TInput> sumLong() {
		return null;
		//return new LongExpression<TInput>(this.aggregate(new SumLongExpression()));
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
