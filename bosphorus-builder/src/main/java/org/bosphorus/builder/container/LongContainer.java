package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.ConstantExecutor;
import org.bosphorus.expression.scalar.IScalarExecutor;
import org.bosphorus.expression.scalar.math.AddLong;
import org.bosphorus.expression.scalar.math.DivideLong;
import org.bosphorus.expression.scalar.math.ModLong;
import org.bosphorus.expression.scalar.math.MultiplyLong;
import org.bosphorus.expression.scalar.math.SubtractLong;

public class LongContainer<TInput> extends BaseComparableContainer<TInput, Long> {

	public LongContainer(IScalarExecutor<TInput, Long> expression) {
		super(expression);
	}
	
	public LongContainer<TInput> add(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new AddLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> add(IScalarExecutor<TInput, Long> expression) {
		return new LongContainer<TInput>(new AddLong<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> add(Long value) {
		return new LongContainer<TInput>(new AddLong<TInput>(this.getExpression(), new ConstantExecutor<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> subtract(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new SubtractLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> subtract(IScalarExecutor<TInput, Long> expression) {
		return new LongContainer<TInput>(new SubtractLong<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> subtract(Long value) {
		return new LongContainer<TInput>(new SubtractLong<TInput>(this.getExpression(), new ConstantExecutor<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> multiply(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new MultiplyLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> multiply(IScalarExecutor<TInput, Long> expression) {
		return new LongContainer<TInput>(new MultiplyLong<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> multiply(Long value) {
		return new LongContainer<TInput>(new MultiplyLong<TInput>(this.getExpression(), new ConstantExecutor<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> divideBy(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new DivideLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> divideBy(IScalarExecutor<TInput, Long> expression) {
		return new LongContainer<TInput>(new DivideLong<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> divideBy(Long value) {
		return new LongContainer<TInput>(new DivideLong<TInput>(this.getExpression(), new ConstantExecutor<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> mod(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new ModLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> mod(IScalarExecutor<TInput, Long> expression) {
		return new LongContainer<TInput>(new ModLong<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> mod(Long value) {
		return new LongContainer<TInput>(new ModLong<TInput>(this.getExpression(), new ConstantExecutor<TInput, Long>(value)));
	}
	
}
