package org.jcep.builder.types;

import org.jcep.core.expressions.common.Constant;
import org.jcep.core.expressions.common.IExpression;
import org.jcep.core.expressions.condition.LessThan;
import org.jcep.core.expressions.math.AddInteger;
import org.jcep.core.expressions.math.DivideInteger;
import org.jcep.core.expressions.math.ModInteger;
import org.jcep.core.expressions.math.MultiplyInteger;
import org.jcep.core.expressions.math.SubtractInteger;

public class IntegerGetter<TContext> extends BaseTypeGetter<Integer, TContext> {

	public IntegerGetter(IExpression<Integer, TContext> expression) {
		super(expression);
	}
	
	public IntegerGetter<TContext> add(IntegerGetter<TContext> expression) {
		return new IntegerGetter<TContext>(new AddInteger<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerGetter<TContext> add(IExpression<Integer, TContext> expression) {
		return new IntegerGetter<TContext>(new AddInteger<TContext>(this.getExpression(), expression));
	}
	
	public IntegerGetter<TContext> add(Integer value) {
		return new IntegerGetter<TContext>(new AddInteger<TContext>(this.getExpression(), new Constant<Integer, TContext>(value)));
	}
	
	
	public IntegerGetter<TContext> subtract(IntegerGetter<TContext> expression) {
		return new IntegerGetter<TContext>(new SubtractInteger<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerGetter<TContext> subtract(IExpression<Integer, TContext> expression) {
		return new IntegerGetter<TContext>(new SubtractInteger<TContext>(this.getExpression(), expression));
	}
	
	public IntegerGetter<TContext> subtract(Integer value) {
		return new IntegerGetter<TContext>(new SubtractInteger<TContext>(this.getExpression(), new Constant<Integer, TContext>(value)));
	}
	
	
	public IntegerGetter<TContext> multiply(IntegerGetter<TContext> expression) {
		return new IntegerGetter<TContext>(new MultiplyInteger<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerGetter<TContext> multiply(IExpression<Integer, TContext> expression) {
		return new IntegerGetter<TContext>(new MultiplyInteger<TContext>(this.getExpression(), expression));
	}
	
	public IntegerGetter<TContext> multiply(Integer value) {
		return new IntegerGetter<TContext>(new MultiplyInteger<TContext>(this.getExpression(), new Constant<Integer, TContext>(value)));
	}
	
	
	public IntegerGetter<TContext> divideBy(IntegerGetter<TContext> expression) {
		return new IntegerGetter<TContext>(new DivideInteger<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerGetter<TContext> divideBy(IExpression<Integer, TContext> expression) {
		return new IntegerGetter<TContext>(new DivideInteger<TContext>(this.getExpression(), expression));
	}
	
	public IntegerGetter<TContext> divideBy(Integer value) {
		return new IntegerGetter<TContext>(new DivideInteger<TContext>(this.getExpression(), new Constant<Integer, TContext>(value)));
	}
	
	
	public IntegerGetter<TContext> mod(IntegerGetter<TContext> expression) {
		return new IntegerGetter<TContext>(new ModInteger<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerGetter<TContext> mod(IExpression<Integer, TContext> expression) {
		return new IntegerGetter<TContext>(new ModInteger<TContext>(this.getExpression(), expression));
	}
	
	public IntegerGetter<TContext> mod(Integer value) {
		return new IntegerGetter<TContext>(new ModInteger<TContext>(this.getExpression(), new Constant<Integer, TContext>(value)));
	}


}
