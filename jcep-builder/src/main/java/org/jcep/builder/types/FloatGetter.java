package org.jcep.builder.types;

import org.jcep.core.expressions.Constant;
import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.math.AddFloat;
import org.jcep.core.expressions.math.DivideFloat;
import org.jcep.core.expressions.math.MultiplyFloat;
import org.jcep.core.expressions.math.SubtractFloat;

public class FloatGetter<TContext> extends BaseTypeGetter<Float, TContext> {

	public FloatGetter(IExpression<Float, TContext> expression) {
		super(expression);
	}

	public FloatGetter<TContext> add(FloatGetter<TContext> expression) {
		return new FloatGetter<TContext>(new AddFloat<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatGetter<TContext> add(IExpression<Float, TContext> expression) {
		return new FloatGetter<TContext>(new AddFloat<TContext>(this.getExpression(), expression));
	}
	
	public FloatGetter<TContext> add(Float value) {
		return new FloatGetter<TContext>(new AddFloat<TContext>(this.getExpression(), new Constant<Float, TContext>(value)));
	}
	
	
	public FloatGetter<TContext> subtract(FloatGetter<TContext> expression) {
		return new FloatGetter<TContext>(new SubtractFloat<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatGetter<TContext> subtract(IExpression<Float, TContext> expression) {
		return new FloatGetter<TContext>(new SubtractFloat<TContext>(this.getExpression(), expression));
	}
	
	public FloatGetter<TContext> subtract(Float value) {
		return new FloatGetter<TContext>(new SubtractFloat<TContext>(this.getExpression(), new Constant<Float, TContext>(value)));
	}
	
	
	public FloatGetter<TContext> multiply(FloatGetter<TContext> expression) {
		return new FloatGetter<TContext>(new MultiplyFloat<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatGetter<TContext> multiply(IExpression<Float, TContext> expression) {
		return new FloatGetter<TContext>(new MultiplyFloat<TContext>(this.getExpression(), expression));
	}
	
	public FloatGetter<TContext> multiply(Float value) {
		return new FloatGetter<TContext>(new MultiplyFloat<TContext>(this.getExpression(), new Constant<Float, TContext>(value)));
	}
	
	
	public FloatGetter<TContext> divideBy(FloatGetter<TContext> expression) {
		return new FloatGetter<TContext>(new DivideFloat<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatGetter<TContext> divideBy(IExpression<Float, TContext> expression) {
		return new FloatGetter<TContext>(new DivideFloat<TContext>(this.getExpression(), expression));
	}
	
	public FloatGetter<TContext> divideBy(Float value) {
		return new FloatGetter<TContext>(new DivideFloat<TContext>(this.getExpression(), new Constant<Float, TContext>(value)));
	}
	
}