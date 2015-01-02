package org.bosphorus.api.fluent.expression.scalar.primitive;

import java.util.Date;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.builder.expression.scalar.common.ConstantExpression;
import org.bosphorus.api.builder.expression.scalar.common.ConvertExpression;
import org.bosphorus.api.builder.expression.scalar.logical.EqualsExpression;
import org.bosphorus.api.builder.expression.scalar.logical.GreaterThanExpression;
import org.bosphorus.api.builder.expression.scalar.logical.GreaterThanOrEqualExpression;
import org.bosphorus.api.builder.expression.scalar.logical.LessThanExpression;
import org.bosphorus.api.builder.expression.scalar.logical.LessThanOrEqualExpression;
import org.bosphorus.api.builder.expression.scalar.logical.NotEqualsExpression;
import org.bosphorus.api.fluent.expression.scalar.BaseTypeExpression;

public class BaseComparableExpression<TInput, TOutput extends Comparable<TOutput>> extends BaseTypeExpression<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseComparableExpression(IScalarExpression<TInput, TOutput> builder) {
		super(builder);
	}
	
	public BooleanExpression<TInput> convertToBoolean() {
		return new BooleanExpression<TInput>(new ConvertExpression<TInput, Boolean, TOutput>(this.getBuilder()));
	}
	
	public DateExpression<TInput> convertToDate() {
		return new DateExpression<TInput>(new ConvertExpression<TInput, Date, TOutput>(this.getBuilder()));
	}
	
	public DoubleExpression<TInput> convertToDouble() {
		return new DoubleExpression<TInput>(new ConvertExpression<TInput, Double, TOutput>(this.getBuilder()));
	}
	
	public FloatExpression<TInput> convertToFloat() {
		return new FloatExpression<TInput>(new ConvertExpression<TInput, Float, TOutput>(this.getBuilder()));
	}
	
	public IntegerExpression<TInput> convertToInteger() {
		return new IntegerExpression<TInput>(new ConvertExpression<TInput, Integer, TOutput>(this.getBuilder()));
	}
	
	public LongExpression<TInput> convertToLong() {
		return new LongExpression<TInput>(new ConvertExpression<TInput, Long, TOutput>(this.getBuilder()));
	}
	
	public StringExpression<TInput> convertToString() {
		return new StringExpression<TInput>(new ConvertExpression<TInput, String, TOutput>(this.getBuilder()));
	}
	
	public BooleanExpression<TInput> isEqualTo(IScalarExpression<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new EqualsExpression<TInput, TOutput>(this, expression));
	}
	
	public BooleanExpression<TInput> isEqualTo(TOutput value) {
		return this.isEqualTo(new ConstantExpression<TInput, TOutput>(value));
	}
	
	public BooleanExpression<TInput> isNotEqualTo(IScalarExpression<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new NotEqualsExpression<TInput, TOutput>(this, expression));
	}
	
	public BooleanExpression<TInput> isNotEqualTo(TOutput value) {
		return this.isNotEqualTo(new ConstantExpression<TInput, TOutput>(value));
	}
	
	public BooleanExpression<TInput> isGreaterThan(IScalarExpression<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new GreaterThanExpression<TInput, TOutput>(this, expression));
	}
	
	public BooleanExpression<TInput> isGreaterThan(TOutput value) {
		return this.isGreaterThan(new ConstantExpression<TInput, TOutput>(value));
	}
	
	public BooleanExpression<TInput> isGreaterThanOrEqualTo(IScalarExpression<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new GreaterThanOrEqualExpression<TInput, TOutput>(this, expression));
	}
	
	public BooleanExpression<TInput> isGreaterThanOrEqualTo(TOutput value) {
		return this.isGreaterThan(new ConstantExpression<TInput, TOutput>(value));
	}
	
	public BooleanExpression<TInput> isLessThan(IScalarExpression<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new LessThanExpression<TInput, TOutput>(this, expression));
	}
	
	public BooleanExpression<TInput> isLessThan(TOutput value) {
		return this.isLessThan(new ConstantExpression<TInput, TOutput>(value));
	}
	
	public BooleanExpression<TInput> isLessThanOrEqualTo(IScalarExpression<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new LessThanOrEqualExpression<TInput, TOutput>(this, expression));
	}
	
	public BooleanExpression<TInput> isLessThanOrEqualTo(TOutput value) {
		return this.isLessThanOrEqualTo(new ConstantExpression<TInput, TOutput>(value));
	}

}
