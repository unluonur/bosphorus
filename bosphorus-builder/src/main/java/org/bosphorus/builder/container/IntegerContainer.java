package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.common.ConstantExecutor;
import org.bosphorus.expression.scalar.executor.math.AddIntegerExecutor;
import org.bosphorus.expression.scalar.executor.math.DivideIntegerExecutor;
import org.bosphorus.expression.scalar.executor.math.ModIntegerExecutor;
import org.bosphorus.expression.scalar.executor.math.MultiplyIntegerExecutor;
import org.bosphorus.expression.scalar.executor.math.SubtractIntegerExecutor;

public class IntegerContainer<TInput> extends BaseComparableContainer<TInput, Integer> {

	public IntegerContainer(IScalarExecutor<TInput, Integer> expression) {
		super(expression);
	}
	
	public IntegerContainer<TInput> add(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new AddIntegerExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> add(IScalarExecutor<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new AddIntegerExecutor<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> add(Integer value) {
		return new IntegerContainer<TInput>(new AddIntegerExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> subtract(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new SubtractIntegerExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> subtract(IScalarExecutor<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new SubtractIntegerExecutor<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> subtract(Integer value) {
		return new IntegerContainer<TInput>(new SubtractIntegerExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> multiply(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new MultiplyIntegerExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> multiply(IScalarExecutor<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new MultiplyIntegerExecutor<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> multiply(Integer value) {
		return new IntegerContainer<TInput>(new MultiplyIntegerExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> divideBy(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new DivideIntegerExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> divideBy(IScalarExecutor<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new DivideIntegerExecutor<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> divideBy(Integer value) {
		return new IntegerContainer<TInput>(new DivideIntegerExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> mod(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new ModIntegerExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> mod(IScalarExecutor<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new ModIntegerExecutor<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> mod(Integer value) {
		return new IntegerContainer<TInput>(new ModIntegerExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Integer>(value)));
	}


}
