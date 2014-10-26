package org.jcep.builder.types;

import org.jcep.core.expressions.Constant;
import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.math.AddFloat;
import org.jcep.core.expressions.math.DivideFloat;
import org.jcep.core.expressions.math.MultiplyFloat;
import org.jcep.core.expressions.math.SubtractFloat;

public class FloatGetter<TInput> extends BaseTypeGetter<TInput, Float> {

	public FloatGetter(IExpression<TInput, Float> expression) {
		super(expression);
	}

	public FloatGetter<TInput> add(FloatGetter<TInput> expression) {
		return new FloatGetter<TInput>(new AddFloat<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatGetter<TInput> add(IExpression<TInput, Float> expression) {
		return new FloatGetter<TInput>(new AddFloat<TInput>(this.getExpression(), expression));
	}
	
	public FloatGetter<TInput> add(Float value) {
		return new FloatGetter<TInput>(new AddFloat<TInput>(this.getExpression(), new Constant<TInput, Float>(value)));
	}
	
	
	public FloatGetter<TInput> subtract(FloatGetter<TInput> expression) {
		return new FloatGetter<TInput>(new SubtractFloat<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatGetter<TInput> subtract(IExpression<TInput, Float> expression) {
		return new FloatGetter<TInput>(new SubtractFloat<TInput>(this.getExpression(), expression));
	}
	
	public FloatGetter<TInput> subtract(Float value) {
		return new FloatGetter<TInput>(new SubtractFloat<TInput>(this.getExpression(), new Constant<TInput, Float>(value)));
	}
	
	
	public FloatGetter<TInput> multiply(FloatGetter<TInput> expression) {
		return new FloatGetter<TInput>(new MultiplyFloat<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatGetter<TInput> multiply(IExpression<TInput, Float> expression) {
		return new FloatGetter<TInput>(new MultiplyFloat<TInput>(this.getExpression(), expression));
	}
	
	public FloatGetter<TInput> multiply(Float value) {
		return new FloatGetter<TInput>(new MultiplyFloat<TInput>(this.getExpression(), new Constant<TInput, Float>(value)));
	}
	
	
	public FloatGetter<TInput> divideBy(FloatGetter<TInput> expression) {
		return new FloatGetter<TInput>(new DivideFloat<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatGetter<TInput> divideBy(IExpression<TInput, Float> expression) {
		return new FloatGetter<TInput>(new DivideFloat<TInput>(this.getExpression(), expression));
	}
	
	public FloatGetter<TInput> divideBy(Float value) {
		return new FloatGetter<TInput>(new DivideFloat<TInput>(this.getExpression(), new Constant<TInput, Float>(value)));
	}
	
}