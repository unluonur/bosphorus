package org.bosphorus.api.fluent.expression.scalar.list;

import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.math.AvgDoubleExpression;
import org.bosphorus.api.builder.expression.aggregate.math.AvgFloatExpression;
import org.bosphorus.api.builder.expression.aggregate.math.AvgIntegerExpression;
import org.bosphorus.api.builder.expression.aggregate.math.AvgLongExpression;
import org.bosphorus.api.builder.expression.aggregate.math.SumDoubleExpression;
import org.bosphorus.api.builder.expression.aggregate.math.SumFloatExpression;
import org.bosphorus.api.builder.expression.aggregate.math.SumIntegerExpression;
import org.bosphorus.api.builder.expression.aggregate.math.SumLongExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.builder.expression.scalar.aggregate.ListAggregateExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.BaseComparableExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.DoubleExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.FloatExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.IntegerExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.LongExpression;

public abstract class BaseNumberListExpression<TInput, TType extends Number & Comparable<TType>, TPrimitiveType extends BaseComparableExpression<TInput, TType>> extends BasePrimitiveListExpression<TInput, TType, TPrimitiveType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseNumberListExpression(IScalarExpression1<TInput, ? extends List<? extends TType>> builder) {
		super(builder);
	}

	public IntegerExpression<TInput> sumInteger() {
		return new IntegerExpression<TInput>(new ListAggregateExpression<TInput, Number, Integer>(this, new SumIntegerExpression()));
	}
	
	
	public LongExpression<TInput> sumLong() {
		return new LongExpression<TInput>(new ListAggregateExpression<TInput, Number, Long>(this, new SumLongExpression()));
	}
	
	public FloatExpression<TInput> sumFloat() {
		return new FloatExpression<TInput>(new ListAggregateExpression<TInput, Number, Float>(this, new SumFloatExpression()));
	}
	
	public DoubleExpression<TInput> sumDouble() {
		return new DoubleExpression<TInput>(new ListAggregateExpression<TInput, Number, Double>(this, new SumDoubleExpression()));
	}
	
	public IntegerExpression<TInput> avgInteger() {
		return new IntegerExpression<TInput>(new ListAggregateExpression<TInput, Number, Integer>(this, new AvgIntegerExpression()));
	}
	
	public LongExpression<TInput> avgLong() {
		return new LongExpression<TInput>(new ListAggregateExpression<TInput, Number, Long>(this, new AvgLongExpression()));
	}
	
	public FloatExpression<TInput> avgFloat() {
		return new FloatExpression<TInput>(new ListAggregateExpression<TInput, Number, Float>(this, new AvgFloatExpression()));
	}
	
	public DoubleExpression<TInput> avgDouble() {
		return new DoubleExpression<TInput>(new ListAggregateExpression<TInput, Number, Double>(this, new AvgDoubleExpression()));
	}

}
