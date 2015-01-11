package org.bosphorus.api.fluent.expression.scalar.primitive;

import java.util.Date;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.builder.expression.scalar.common.ConstantExpression;
import org.bosphorus.api.builder.expression.scalar.common.ConvertExpression;
import org.bosphorus.api.builder.expression.scalar.event.ScalarExpression0;
import org.bosphorus.api.builder.expression.scalar.event.ScalarExpression1;
import org.bosphorus.api.builder.expression.scalar.event.ScalarExpression2;
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

	public BaseComparableExpression(IScalarExpression1<TInput, TOutput> builder) {
		super(builder);
	}
	
	public BooleanExpression<TInput> convertToBoolean() {
		return new BooleanExpression<TInput>(new ScalarExpression1<TInput, Boolean, TOutput>(new ConvertExpression<TOutput, Boolean>(), this.getBuilder()));
	}
	
	public DateExpression<TInput> convertToDate() {
		return new DateExpression<TInput>(new ScalarExpression1<TInput, Date, TOutput>(new ConvertExpression<TOutput, Date>(), this.getBuilder()));
	}
	
	public DoubleExpression<TInput> convertToDouble() {
		return new DoubleExpression<TInput>(new ScalarExpression1<TInput, Double, TOutput>(new ConvertExpression<TOutput, Double>(), this.getBuilder()));
	}
	
	public FloatExpression<TInput> convertToFloat() {
		return new FloatExpression<TInput>(new ScalarExpression1<TInput, Float, TOutput>(new ConvertExpression<TOutput, Float>(), this.getBuilder()));
	}
	
	public IntegerExpression<TInput> convertToInteger() {
		return new IntegerExpression<TInput>(new ScalarExpression1<TInput, Integer, TOutput>(new ConvertExpression<TOutput, Integer>(), this.getBuilder()));
	}
	
	public LongExpression<TInput> convertToLong() {
		return new LongExpression<TInput>(new ScalarExpression1<TInput, Long, TOutput>(new ConvertExpression<TOutput, Long>(), this.getBuilder()));
	}
	
	public StringExpression<TInput> convertToString() {
		return new StringExpression<TInput>(new ScalarExpression1<TInput, String, TOutput>(new ConvertExpression<TOutput, String>(), this.getBuilder()));
	}
	
	public BooleanExpression<TInput> isEqualTo(IScalarExpression1<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new ScalarExpression2<TInput, Boolean, TOutput, TOutput>(new EqualsExpression<TOutput>(), this.getBuilder(), expression));
	}
	
	public BooleanExpression<TInput> isEqualTo(TOutput value) {
		return this.isEqualTo(new ScalarExpression0<TInput, TOutput>(new ConstantExpression<TOutput>(value)));
	}
	
	public BooleanExpression<TInput> isNotEqualTo(IScalarExpression1<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new ScalarExpression2<TInput, Boolean, TOutput, TOutput>(new NotEqualsExpression<TOutput>(), this.getBuilder(), expression));
	}
	
	public BooleanExpression<TInput> isNotEqualTo(TOutput value) {
		return this.isNotEqualTo(new ScalarExpression0<TInput, TOutput>(new ConstantExpression<TOutput>(value)));
	}
	
	public BooleanExpression<TInput> isGreaterThan(IScalarExpression1<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new ScalarExpression2<TInput, Boolean, TOutput, TOutput>(new GreaterThanExpression<TOutput>(), this.getBuilder(), expression));
	}
	
	public BooleanExpression<TInput> isGreaterThan(TOutput value) {
		return this.isGreaterThan(new ScalarExpression0<TInput, TOutput>(new ConstantExpression<TOutput>(value)));
	}
	
	public BooleanExpression<TInput> isGreaterThanOrEqualTo(IScalarExpression1<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new ScalarExpression2<TInput, Boolean, TOutput, TOutput>(new GreaterThanOrEqualExpression<TOutput>(), this.getBuilder(), expression));
	}
	
	public BooleanExpression<TInput> isGreaterThanOrEqualTo(TOutput value) {
		return this.isGreaterThanOrEqualTo(new ScalarExpression0<TInput, TOutput>(new ConstantExpression<TOutput>(value)));
	}
	
	public BooleanExpression<TInput> isLessThan(IScalarExpression1<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new ScalarExpression2<TInput, Boolean, TOutput, TOutput>(new LessThanExpression<TOutput>(), this.getBuilder(), expression));
	}
	
	public BooleanExpression<TInput> isLessThan(TOutput value) {
		return this.isLessThan(new ScalarExpression0<TInput, TOutput>(new ConstantExpression<TOutput>(value)));
	}
	
	public BooleanExpression<TInput> isLessThanOrEqualTo(IScalarExpression1<TInput, TOutput> expression) {
		return new BooleanExpression<TInput>(new ScalarExpression2<TInput, Boolean, TOutput, TOutput>(new LessThanOrEqualExpression<TOutput>(), this.getBuilder(), expression));
	}
	
	public BooleanExpression<TInput> isLessThanOrEqualTo(TOutput value) {
		return this.isLessThanOrEqualTo(new ScalarExpression0<TInput, TOutput>(new ConstantExpression<TOutput>(value)));
	}

}
