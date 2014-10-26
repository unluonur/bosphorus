package org.bosphorus.builder.container;

import org.bosphorus.core.expression.Constant;
import org.bosphorus.core.expression.IExpression;
import org.bosphorus.core.expression.math.AddDouble;
import org.bosphorus.core.expression.math.DivideDouble;
import org.bosphorus.core.expression.math.MultiplyDouble;
import org.bosphorus.core.expression.math.SubtractDouble;

public class DoubleContainer<TInput> extends BaseComparableContainer<TInput, Double> {

	public DoubleContainer(IExpression<TInput, Double> expression) {
		super(expression);
	}
	

	public DoubleContainer<TInput> add(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new AddDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> add(IExpression<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new AddDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> add(Double value) {
		return new DoubleContainer<TInput>(new AddDouble<TInput>(this.getExpression(), new Constant<TInput, Double>(value)));
	}
	
	
	public DoubleContainer<TInput> subtract(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new SubtractDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> subtract(IExpression<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new SubtractDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> subtract(Double value) {
		return new DoubleContainer<TInput>(new SubtractDouble<TInput>(this.getExpression(), new Constant<TInput, Double>(value)));
	}
	
	
	public DoubleContainer<TInput> multiply(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new MultiplyDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> multiply(IExpression<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new MultiplyDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> multiply(Double value) {
		return new DoubleContainer<TInput>(new MultiplyDouble<TInput>(this.getExpression(), new Constant<TInput, Double>(value)));
	}
	
	
	public DoubleContainer<TInput> divideBy(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new DivideDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> divideBy(IExpression<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new DivideDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> divideBy(Double value) {
		return new DoubleContainer<TInput>(new DivideDouble<TInput>(this.getExpression(), new Constant<TInput, Double>(value)));
	}
		
}
