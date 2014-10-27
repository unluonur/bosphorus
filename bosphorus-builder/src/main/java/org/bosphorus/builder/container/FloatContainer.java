package org.bosphorus.builder.container;

import org.bosphorus.expression.Constant;
import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.math.AddFloat;
import org.bosphorus.expression.math.DivideFloat;
import org.bosphorus.expression.math.MultiplyFloat;
import org.bosphorus.expression.math.SubtractFloat;

public class FloatContainer<TInput> extends BaseComparableContainer<TInput, Float> {

	public FloatContainer(IExpression<TInput, Float> expression) {
		super(expression);
	}

	public FloatContainer<TInput> add(FloatContainer<TInput> expression) {
		return new FloatContainer<TInput>(new AddFloat<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer<TInput> add(IExpression<TInput, Float> expression) {
		return new FloatContainer<TInput>(new AddFloat<TInput>(this.getExpression(), expression));
	}
	
	public FloatContainer<TInput> add(Float value) {
		return new FloatContainer<TInput>(new AddFloat<TInput>(this.getExpression(), new Constant<TInput, Float>(value)));
	}
	
	
	public FloatContainer<TInput> subtract(FloatContainer<TInput> expression) {
		return new FloatContainer<TInput>(new SubtractFloat<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer<TInput> subtract(IExpression<TInput, Float> expression) {
		return new FloatContainer<TInput>(new SubtractFloat<TInput>(this.getExpression(), expression));
	}
	
	public FloatContainer<TInput> subtract(Float value) {
		return new FloatContainer<TInput>(new SubtractFloat<TInput>(this.getExpression(), new Constant<TInput, Float>(value)));
	}
	
	
	public FloatContainer<TInput> multiply(FloatContainer<TInput> expression) {
		return new FloatContainer<TInput>(new MultiplyFloat<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer<TInput> multiply(IExpression<TInput, Float> expression) {
		return new FloatContainer<TInput>(new MultiplyFloat<TInput>(this.getExpression(), expression));
	}
	
	public FloatContainer<TInput> multiply(Float value) {
		return new FloatContainer<TInput>(new MultiplyFloat<TInput>(this.getExpression(), new Constant<TInput, Float>(value)));
	}
	
	
	public FloatContainer<TInput> divideBy(FloatContainer<TInput> expression) {
		return new FloatContainer<TInput>(new DivideFloat<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer<TInput> divideBy(IExpression<TInput, Float> expression) {
		return new FloatContainer<TInput>(new DivideFloat<TInput>(this.getExpression(), expression));
	}
	
	public FloatContainer<TInput> divideBy(Float value) {
		return new FloatContainer<TInput>(new DivideFloat<TInput>(this.getExpression(), new Constant<TInput, Float>(value)));
	}
	
}