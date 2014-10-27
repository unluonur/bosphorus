package org.bosphorus.builder.container;

import org.bosphorus.expression.Constant;
import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.math.AddLong;
import org.bosphorus.expression.math.DivideLong;
import org.bosphorus.expression.math.ModLong;
import org.bosphorus.expression.math.MultiplyLong;
import org.bosphorus.expression.math.SubtractLong;

public class LongContainer<TInput> extends BaseComparableContainer<TInput, Long> {

	public LongContainer(IExpression<TInput, Long> expression) {
		super(expression);
	}
	
	public LongContainer<TInput> add(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new AddLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> add(IExpression<TInput, Long> expression) {
		return new LongContainer<TInput>(new AddLong<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> add(Long value) {
		return new LongContainer<TInput>(new AddLong<TInput>(this.getExpression(), new Constant<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> subtract(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new SubtractLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> subtract(IExpression<TInput, Long> expression) {
		return new LongContainer<TInput>(new SubtractLong<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> subtract(Long value) {
		return new LongContainer<TInput>(new SubtractLong<TInput>(this.getExpression(), new Constant<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> multiply(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new MultiplyLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> multiply(IExpression<TInput, Long> expression) {
		return new LongContainer<TInput>(new MultiplyLong<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> multiply(Long value) {
		return new LongContainer<TInput>(new MultiplyLong<TInput>(this.getExpression(), new Constant<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> divideBy(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new DivideLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> divideBy(IExpression<TInput, Long> expression) {
		return new LongContainer<TInput>(new DivideLong<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> divideBy(Long value) {
		return new LongContainer<TInput>(new DivideLong<TInput>(this.getExpression(), new Constant<TInput, Long>(value)));
	}
	
	
	public LongContainer<TInput> mod(LongContainer<TInput> expression) {
		return new LongContainer<TInput>(new ModLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer<TInput> mod(IExpression<TInput, Long> expression) {
		return new LongContainer<TInput>(new ModLong<TInput>(this.getExpression(), expression));
	}
	
	public LongContainer<TInput> mod(Long value) {
		return new LongContainer<TInput>(new ModLong<TInput>(this.getExpression(), new Constant<TInput, Long>(value)));
	}
	
}