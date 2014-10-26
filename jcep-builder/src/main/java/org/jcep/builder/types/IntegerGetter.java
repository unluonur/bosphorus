package org.jcep.builder.types;

import org.jcep.core.expressions.Constant;
import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.condition.LessThan;
import org.jcep.core.expressions.math.AddInteger;
import org.jcep.core.expressions.math.DivideInteger;
import org.jcep.core.expressions.math.ModInteger;
import org.jcep.core.expressions.math.MultiplyInteger;
import org.jcep.core.expressions.math.SubtractInteger;

public class IntegerGetter<TInput> extends BaseTypeGetter<TInput, Integer> {

	public IntegerGetter(IExpression<TInput, Integer> expression) {
		super(expression);
	}
	
	public IntegerGetter<TInput> add(IntegerGetter<TInput> expression) {
		return new IntegerGetter<TInput>(new AddInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerGetter<TInput> add(IExpression<TInput, Integer> expression) {
		return new IntegerGetter<TInput>(new AddInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerGetter<TInput> add(Integer value) {
		return new IntegerGetter<TInput>(new AddInteger<TInput>(this.getExpression(), new Constant<TInput, Integer>(value)));
	}
	
	
	public IntegerGetter<TInput> subtract(IntegerGetter<TInput> expression) {
		return new IntegerGetter<TInput>(new SubtractInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerGetter<TInput> subtract(IExpression<TInput, Integer> expression) {
		return new IntegerGetter<TInput>(new SubtractInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerGetter<TInput> subtract(Integer value) {
		return new IntegerGetter<TInput>(new SubtractInteger<TInput>(this.getExpression(), new Constant<TInput, Integer>(value)));
	}
	
	
	public IntegerGetter<TInput> multiply(IntegerGetter<TInput> expression) {
		return new IntegerGetter<TInput>(new MultiplyInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerGetter<TInput> multiply(IExpression<TInput, Integer> expression) {
		return new IntegerGetter<TInput>(new MultiplyInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerGetter<TInput> multiply(Integer value) {
		return new IntegerGetter<TInput>(new MultiplyInteger<TInput>(this.getExpression(), new Constant<TInput, Integer>(value)));
	}
	
	
	public IntegerGetter<TInput> divideBy(IntegerGetter<TInput> expression) {
		return new IntegerGetter<TInput>(new DivideInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerGetter<TInput> divideBy(IExpression<TInput, Integer> expression) {
		return new IntegerGetter<TInput>(new DivideInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerGetter<TInput> divideBy(Integer value) {
		return new IntegerGetter<TInput>(new DivideInteger<TInput>(this.getExpression(), new Constant<TInput, Integer>(value)));
	}
	
	
	public IntegerGetter<TInput> mod(IntegerGetter<TInput> expression) {
		return new IntegerGetter<TInput>(new ModInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerGetter<TInput> mod(IExpression<TInput, Integer> expression) {
		return new IntegerGetter<TInput>(new ModInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerGetter<TInput> mod(Integer value) {
		return new IntegerGetter<TInput>(new ModInteger<TInput>(this.getExpression(), new Constant<TInput, Integer>(value)));
	}


}
