package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.common.ConstantExecutor;
import org.bosphorus.expression.scalar.executor.math.AddDoubleExecutor;
import org.bosphorus.expression.scalar.executor.math.DivideDoubleExecutor;
import org.bosphorus.expression.scalar.executor.math.MultiplyDoubleExecutor;
import org.bosphorus.expression.scalar.executor.math.SubtractDoubleExecutor;

public class DoubleContainer<TInput> extends BaseComparableContainer<TInput, Double> {

	public DoubleContainer(IScalarExecutor<TInput, Double> expression) {
		super(expression);
	}
	

	public DoubleContainer<TInput> add(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new AddDoubleExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> add(IScalarExecutor<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new AddDoubleExecutor<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> add(Double value) {
		return new DoubleContainer<TInput>(new AddDoubleExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Double>(value)));
	}
	
	
	public DoubleContainer<TInput> subtract(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new SubtractDoubleExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> subtract(IScalarExecutor<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new SubtractDoubleExecutor<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> subtract(Double value) {
		return new DoubleContainer<TInput>(new SubtractDoubleExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Double>(value)));
	}
	
	
	public DoubleContainer<TInput> multiply(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new MultiplyDoubleExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> multiply(IScalarExecutor<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new MultiplyDoubleExecutor<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> multiply(Double value) {
		return new DoubleContainer<TInput>(new MultiplyDoubleExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Double>(value)));
	}
	
	
	public DoubleContainer<TInput> divideBy(DoubleContainer<TInput> expression) {
		return new DoubleContainer<TInput>(new DivideDoubleExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleContainer<TInput> divideBy(IScalarExecutor<TInput, Double> expression) {
		return new DoubleContainer<TInput>(new DivideDoubleExecutor<TInput>(this.getExpression(), expression));
	}
	
	public DoubleContainer<TInput> divideBy(Double value) {
		return new DoubleContainer<TInput>(new DivideDoubleExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Double>(value)));
	}
		
}
