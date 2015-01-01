package org.bosphorus.api.fluent.expression.scalar.primitive;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.fluent.expression.scalar.BaseTypeExpression;

public class ObjectExpression<TInput> extends BaseTypeExpression<TInput, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ObjectExpression(IScalarExpression<TInput, Object> builder) {
		super(builder);
	}
	
	public IntegerExpression<TInput> integerValue() {
		return new IntegerExpression<TInput>(this.convert());
	}
	
	public LongExpression<TInput> longValue() {
		return new LongExpression<TInput>(this.convert());
	}
	
	public FloatExpression<TInput> floatValue() {
		return new FloatExpression<TInput>(this.convert());
	}
	
	public DoubleExpression<TInput> doubleValue() {
		return new DoubleExpression<TInput>(this.convert());
	}
	
	public StringExpression<TInput> stringValue() {
		return new StringExpression<TInput>(this.convert());
	}
	
	public BooleanExpression<TInput> booleanValue() {
		return new BooleanExpression<TInput>(this.convert());
	}
	
	public DateExpression<TInput> dateValue() {
		return new DateExpression<TInput>(this.convert());
	}

}
