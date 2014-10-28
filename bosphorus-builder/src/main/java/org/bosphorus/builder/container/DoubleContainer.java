package org.bosphorus.builder.container;

import org.bosphorus.expression.Constant;
import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.math.AddDouble;
import org.bosphorus.expression.math.DivideDouble;
import org.bosphorus.expression.math.MultiplyDouble;
import org.bosphorus.expression.math.SubtractDouble;

public class DoubleContainer extends BaseComparableContainer<Double> {

	public DoubleContainer(IExpression<Double> expression) {
		super(expression);
	}
	

	public DoubleContainer add(DoubleContainer expression) {
		return new DoubleContainer(new AddDouble(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer add(IExpression<Double> expression) {
		return new DoubleContainer(new AddDouble(this.getExpression(), expression));
	}
	
	public DoubleContainer add(Double value) {
		return new DoubleContainer(new AddDouble(this.getExpression(), new Constant<Double>(value)));
	}
	
	
	public DoubleContainer subtract(DoubleContainer expression) {
		return new DoubleContainer(new SubtractDouble(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer subtract(IExpression<Double> expression) {
		return new DoubleContainer(new SubtractDouble(this.getExpression(), expression));
	}
	
	public DoubleContainer subtract(Double value) {
		return new DoubleContainer(new SubtractDouble(this.getExpression(), new Constant<Double>(value)));
	}
	
	
	public DoubleContainer multiply(DoubleContainer expression) {
		return new DoubleContainer(new MultiplyDouble(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer multiply(IExpression<Double> expression) {
		return new DoubleContainer(new MultiplyDouble(this.getExpression(), expression));
	}
	
	public DoubleContainer multiply(Double value) {
		return new DoubleContainer(new MultiplyDouble(this.getExpression(), new Constant<Double>(value)));
	}
	
	
	public DoubleContainer divideBy(DoubleContainer expression) {
		return new DoubleContainer(new DivideDouble(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer divideBy(IExpression<Double> expression) {
		return new DoubleContainer(new DivideDouble(this.getExpression(), expression));
	}
	
	public DoubleContainer divideBy(Double value) {
		return new DoubleContainer(new DivideDouble(this.getExpression(), new Constant<Double>(value)));
	}
		
}
