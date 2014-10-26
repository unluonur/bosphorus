package org.jcep.builder.types;

import org.jcep.core.expressions.Constant;
import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.math.AddInteger;
import org.jcep.core.expressions.math.DivideInteger;
import org.jcep.core.expressions.math.ModInteger;
import org.jcep.core.expressions.math.MultiplyInteger;
import org.jcep.core.expressions.math.SubtractInteger;

public class IntegerContainer<TInput> extends BaseComparableContainer<TInput, Integer> {

	public IntegerContainer(IExpression<TInput, Integer> expression) {
		super(expression);
	}
	
	public IntegerContainer<TInput> add(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new AddInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> add(IExpression<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new AddInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> add(Integer value) {
		return new IntegerContainer<TInput>(new AddInteger<TInput>(this.getExpression(), new Constant<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> subtract(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new SubtractInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> subtract(IExpression<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new SubtractInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> subtract(Integer value) {
		return new IntegerContainer<TInput>(new SubtractInteger<TInput>(this.getExpression(), new Constant<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> multiply(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new MultiplyInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> multiply(IExpression<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new MultiplyInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> multiply(Integer value) {
		return new IntegerContainer<TInput>(new MultiplyInteger<TInput>(this.getExpression(), new Constant<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> divideBy(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new DivideInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> divideBy(IExpression<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new DivideInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> divideBy(Integer value) {
		return new IntegerContainer<TInput>(new DivideInteger<TInput>(this.getExpression(), new Constant<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> mod(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new ModInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> mod(IExpression<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new ModInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> mod(Integer value) {
		return new IntegerContainer<TInput>(new ModInteger<TInput>(this.getExpression(), new Constant<TInput, Integer>(value)));
	}


}
