package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.common.ConstantExecutor;
import org.bosphorus.expression.scalar.executor.math.AddLongExecutor;
import org.bosphorus.expression.scalar.executor.math.DivideLongExecutor;
import org.bosphorus.expression.scalar.executor.math.ModLongExecutor;
import org.bosphorus.expression.scalar.executor.math.MultiplyLongExecutor;
import org.bosphorus.expression.scalar.executor.math.SubtractLongExecutor;

public class LongContainer<TInput> extends BaseComparableContainer<TInput, Long> {

	public LongContainer(IScalarExecutor<TInput, Long> expression) {
		super(expression);
	}
	
	public LongContainer<TInput> add(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new AddLongExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> add(IScalarExecutor<TInput, Long> expression) {
		return new LongContainer<TInput>(new AddLongExecutor<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> add(Long value) {
		return new LongContainer<TInput>(new AddLongExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> subtract(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new SubtractLongExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> subtract(IScalarExecutor<TInput, Long> expression) {
		return new LongContainer<TInput>(new SubtractLongExecutor<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> subtract(Long value) {
		return new LongContainer<TInput>(new SubtractLongExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> multiply(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new MultiplyLongExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> multiply(IScalarExecutor<TInput, Long> expression) {
		return new LongContainer<TInput>(new MultiplyLongExecutor<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> multiply(Long value) {
		return new LongContainer<TInput>(new MultiplyLongExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> divideBy(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new DivideLongExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> divideBy(IScalarExecutor<TInput, Long> expression) {
		return new LongContainer<TInput>(new DivideLongExecutor<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> divideBy(Long value) {
		return new LongContainer<TInput>(new DivideLongExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> mod(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new ModLongExecutor<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> mod(IScalarExecutor<TInput, Long> expression) {
		return new LongContainer<TInput>(new ModLongExecutor<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> mod(Long value) {
		return new LongContainer<TInput>(new ModLongExecutor<TInput>(this.getExpression(), new ConstantExecutor<TInput, Long>(value)));
	}
	
}
