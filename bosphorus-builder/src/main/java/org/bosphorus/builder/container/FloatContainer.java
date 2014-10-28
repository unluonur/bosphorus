package org.bosphorus.builder.container;

import org.bosphorus.expression.Constant;
import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.math.AddFloat;
import org.bosphorus.expression.math.DivideFloat;
import org.bosphorus.expression.math.MultiplyFloat;
import org.bosphorus.expression.math.SubtractFloat;

public class FloatContainer extends BaseComparableContainer<Float> {

	public FloatContainer(IExpression<Float> expression) {
		super(expression);
	}

	public FloatContainer add(FloatContainer expression) {
		return new FloatContainer(new AddFloat(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer add(IExpression<Float> expression) {
		return new FloatContainer(new AddFloat(this.getExpression(), expression));
	}
	
	public FloatContainer add(Float value) {
		return new FloatContainer(new AddFloat(this.getExpression(), new Constant<Float>(value)));
	}
	
	
	public FloatContainer subtract(FloatContainer expression) {
		return new FloatContainer(new SubtractFloat(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer subtract(IExpression<Float> expression) {
		return new FloatContainer(new SubtractFloat(this.getExpression(), expression));
	}
	
	public FloatContainer subtract(Float value) {
		return new FloatContainer(new SubtractFloat(this.getExpression(), new Constant<Float>(value)));
	}
	
	
	public FloatContainer multiply(FloatContainer expression) {
		return new FloatContainer(new MultiplyFloat(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer multiply(IExpression<Float> expression) {
		return new FloatContainer(new MultiplyFloat(this.getExpression(), expression));
	}
	
	public FloatContainer multiply(Float value) {
		return new FloatContainer(new MultiplyFloat(this.getExpression(), new Constant<Float>(value)));
	}
	
	
	public FloatContainer divideBy(FloatContainer expression) {
		return new FloatContainer(new DivideFloat(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer divideBy(IExpression<Float> expression) {
		return new FloatContainer(new DivideFloat(this.getExpression(), expression));
	}
	
	public FloatContainer divideBy(Float value) {
		return new FloatContainer(new DivideFloat(this.getExpression(), new Constant<Float>(value)));
	}
	
}