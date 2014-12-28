package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.common.ConstantExecutor;
import org.bosphorus.expression.scalar.executor.math.AddFloatExecutor;
import org.bosphorus.expression.scalar.executor.math.DivideFloatExecutor;
import org.bosphorus.expression.scalar.executor.math.MultiplyFloatExecutor;
import org.bosphorus.expression.scalar.executor.math.SubtractFloatExecutor;

public class FloatContainer<TInput> extends BaseComparableContainer<TInput, Float> {

	public FloatContainer(IScalarExecutor<TInput, Float> expression) {
		super(expression);
	}

	public FloatContainer<TInput> add(FloatContainer<TInput> expression) {
		return new FloatContainer<TInput>(new AddFloatExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer<TInput> add(IScalarExecutor<TInput, Float> expression) {
		return new FloatContainer<TInput>(new AddFloatExecutor<TInput>(this.getExpression(), expression));
	}
	
	public FloatContainer<TInput> add(Float value) {
		return new FloatContainer<TInput>(new AddFloatExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Float>(value)));
	}
	
	
	public FloatContainer<TInput> subtract(FloatContainer<TInput> expression) {
		return new FloatContainer<TInput>(new SubtractFloatExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer<TInput> subtract(IScalarExecutor<TInput, Float> expression) {
		return new FloatContainer<TInput>(new SubtractFloatExecutor<TInput>(this.getExpression(), expression));
	}
	
	public FloatContainer<TInput> subtract(Float value) {
		return new FloatContainer<TInput>(new SubtractFloatExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Float>(value)));
	}
	
	
	public FloatContainer<TInput> multiply(FloatContainer<TInput> expression) {
		return new FloatContainer<TInput>(new MultiplyFloatExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer<TInput> multiply(IScalarExecutor<TInput, Float> expression) {
		return new FloatContainer<TInput>(new MultiplyFloatExecutor<TInput>(this.getExpression(), expression));
	}
	
	public FloatContainer<TInput> multiply(Float value) {
		return new FloatContainer<TInput>(new MultiplyFloatExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Float>(value)));
	}
	
	
	public FloatContainer<TInput> divideBy(FloatContainer<TInput> expression) {
		return new FloatContainer<TInput>(new DivideFloatExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public FloatContainer<TInput> divideBy(IScalarExecutor<TInput, Float> expression) {
		return new FloatContainer<TInput>(new DivideFloatExecutor<TInput>(this.getExpression(), expression));
	}
	
	public FloatContainer<TInput> divideBy(Float value) {
		return new FloatContainer<TInput>(new DivideFloatExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Float>(value)));
	}
	
}