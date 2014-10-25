package org.jcep.builder.types;

import org.jcep.core.expressions.Constant;
import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.math.AddLong;
import org.jcep.core.expressions.math.DivideLong;
import org.jcep.core.expressions.math.ModLong;
import org.jcep.core.expressions.math.MultiplyLong;
import org.jcep.core.expressions.math.SubtractLong;

public class LongGetter<TContext> extends BaseTypeGetter<Long, TContext> {

	public LongGetter(IExpression<Long, TContext> expression) {
		super(expression);
	}
	
	public LongGetter<TContext> add(LongGetter<TContext> expression) {
		return new LongGetter<TContext>(new AddLong<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public LongGetter<TContext> add(IExpression<Long, TContext> expression) {
		return new LongGetter<TContext>(new AddLong<TContext>(this.getExpression(), expression));
	}
	
	public LongGetter<TContext> add(Long value) {
		return new LongGetter<TContext>(new AddLong<TContext>(this.getExpression(), new Constant<Long, TContext>(value)));
	}
	
	
	public LongGetter<TContext> subtract(LongGetter<TContext> expression) {
		return new LongGetter<TContext>(new SubtractLong<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public LongGetter<TContext> subtract(IExpression<Long, TContext> expression) {
		return new LongGetter<TContext>(new SubtractLong<TContext>(this.getExpression(), expression));
	}
	
	public LongGetter<TContext> subtract(Long value) {
		return new LongGetter<TContext>(new SubtractLong<TContext>(this.getExpression(), new Constant<Long, TContext>(value)));
	}
	
	
	public LongGetter<TContext> multiply(LongGetter<TContext> expression) {
		return new LongGetter<TContext>(new MultiplyLong<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public LongGetter<TContext> multiply(IExpression<Long, TContext> expression) {
		return new LongGetter<TContext>(new MultiplyLong<TContext>(this.getExpression(), expression));
	}
	
	public LongGetter<TContext> multiply(Long value) {
		return new LongGetter<TContext>(new MultiplyLong<TContext>(this.getExpression(), new Constant<Long, TContext>(value)));
	}
	
	
	public LongGetter<TContext> divideBy(LongGetter<TContext> expression) {
		return new LongGetter<TContext>(new DivideLong<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public LongGetter<TContext> divideBy(IExpression<Long, TContext> expression) {
		return new LongGetter<TContext>(new DivideLong<TContext>(this.getExpression(), expression));
	}
	
	public LongGetter<TContext> divideBy(Long value) {
		return new LongGetter<TContext>(new DivideLong<TContext>(this.getExpression(), new Constant<Long, TContext>(value)));
	}
	
	
	public LongGetter<TContext> mod(LongGetter<TContext> expression) {
		return new LongGetter<TContext>(new ModLong<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public LongGetter<TContext> mod(IExpression<Long, TContext> expression) {
		return new LongGetter<TContext>(new ModLong<TContext>(this.getExpression(), expression));
	}
	
	public LongGetter<TContext> mod(Long value) {
		return new LongGetter<TContext>(new ModLong<TContext>(this.getExpression(), new Constant<Long, TContext>(value)));
	}
	
}
