package org.jcep.builder.types;

import org.jcep.core.expressions.Constant;
import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.math.AddLong;
import org.jcep.core.expressions.math.DivideLong;
import org.jcep.core.expressions.math.ModLong;
import org.jcep.core.expressions.math.MultiplyLong;
import org.jcep.core.expressions.math.SubtractLong;

public class LongGetter<TInput> extends BaseTypeGetter<TInput, Long> {

	public LongGetter(IExpression<TInput, Long> expression) {
		super(expression);
	}
	
	public LongGetter<TInput> add(LongGetter<TInput> expression) {
		return new LongGetter<TInput>(new AddLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongGetter<TInput> add(IExpression<TInput, Long> expression) {
		return new LongGetter<TInput>(new AddLong<TInput>(this.getExpression(), expression));
	}
	
	public LongGetter<TInput> add(Long value) {
		return new LongGetter<TInput>(new AddLong<TInput>(this.getExpression(), new Constant<TInput, Long>(value)));
	}
	
	
	public LongGetter<TInput> subtract(LongGetter<TInput> expression) {
		return new LongGetter<TInput>(new SubtractLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongGetter<TInput> subtract(IExpression<TInput, Long> expression) {
		return new LongGetter<TInput>(new SubtractLong<TInput>(this.getExpression(), expression));
	}
	
	public LongGetter<TInput> subtract(Long value) {
		return new LongGetter<TInput>(new SubtractLong<TInput>(this.getExpression(), new Constant<TInput, Long>(value)));
	}
	
	
	public LongGetter<TInput> multiply(LongGetter<TInput> expression) {
		return new LongGetter<TInput>(new MultiplyLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongGetter<TInput> multiply(IExpression<TInput, Long> expression) {
		return new LongGetter<TInput>(new MultiplyLong<TInput>(this.getExpression(), expression));
	}
	
	public LongGetter<TInput> multiply(Long value) {
		return new LongGetter<TInput>(new MultiplyLong<TInput>(this.getExpression(), new Constant<TInput, Long>(value)));
	}
	
	
	public LongGetter<TInput> divideBy(LongGetter<TInput> expression) {
		return new LongGetter<TInput>(new DivideLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongGetter<TInput> divideBy(IExpression<TInput, Long> expression) {
		return new LongGetter<TInput>(new DivideLong<TInput>(this.getExpression(), expression));
	}
	
	public LongGetter<TInput> divideBy(Long value) {
		return new LongGetter<TInput>(new DivideLong<TInput>(this.getExpression(), new Constant<TInput, Long>(value)));
	}
	
	
	public LongGetter<TInput> mod(LongGetter<TInput> expression) {
		return new LongGetter<TInput>(new ModLong<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public LongGetter<TInput> mod(IExpression<TInput, Long> expression) {
		return new LongGetter<TInput>(new ModLong<TInput>(this.getExpression(), expression));
	}
	
	public LongGetter<TInput> mod(Long value) {
		return new LongGetter<TInput>(new ModLong<TInput>(this.getExpression(), new Constant<TInput, Long>(value)));
	}
	
}
