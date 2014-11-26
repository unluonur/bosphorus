package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.ConstantExecutor;
import org.bosphorus.expression.scalar.IScalarExecutor;
import org.bosphorus.expression.scalar.math.AddDouble;
import org.bosphorus.expression.scalar.math.DivideDouble;
import org.bosphorus.expression.scalar.math.MultiplyDouble;
import org.bosphorus.expression.scalar.math.SubtractDouble;

public class DoubleContainer<TInput> extends BaseComparableContainer<TInput, Double> {

	public DoubleContainer(IScalarExecutor<TInput, Double> expression) {
		super(expression);
	}
	

	public DoubleContainer<TInput> add(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new AddDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> add(IScalarExecutor<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new AddDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> add(Double value) {
		return new DoubleContainer<TInput>(new AddDouble<TInput>(this.getExpression(), new ConstantExecutor<TInput, Double>(value)));
	}
	
	
	public DoubleContainer<TInput> subtract(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new SubtractDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> subtract(IScalarExecutor<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new SubtractDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> subtract(Double value) {
		return new DoubleContainer<TInput>(new SubtractDouble<TInput>(this.getExpression(), new ConstantExecutor<TInput, Double>(value)));
	}
	
	
	public DoubleContainer<TInput> multiply(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new MultiplyDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> multiply(IScalarExecutor<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new MultiplyDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> multiply(Double value) {
		return new DoubleContainer<TInput>(new MultiplyDouble<TInput>(this.getExpression(), new ConstantExecutor<TInput, Double>(value)));
	}
	
	
	public DoubleContainer<TInput> divideBy(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new DivideDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> divideBy(IScalarExecutor<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new DivideDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> divideBy(Double value) {
		return new DoubleContainer<TInput>(new DivideDouble<TInput>(this.getExpression(), new ConstantExecutor<TInput, Double>(value)));
	}
		
}
