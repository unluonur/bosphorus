package org.bosphorus.builder.container;

import org.bosphorus.expression.scalar.ConstantExecutor;
import org.bosphorus.expression.scalar.IScalarExecutor;
import org.bosphorus.expression.scalar.math.AddInteger;
import org.bosphorus.expression.scalar.math.DivideInteger;
import org.bosphorus.expression.scalar.math.ModInteger;
import org.bosphorus.expression.scalar.math.MultiplyInteger;
import org.bosphorus.expression.scalar.math.SubtractInteger;

public class IntegerContainer<TInput> extends BaseComparableContainer<TInput, Integer> {

	public IntegerContainer(IScalarExecutor<TInput, Integer> expression) {
		super(expression);
	}
	
	public IntegerContainer<TInput> add(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new AddInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> add(IScalarExecutor<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new AddInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> add(Integer value) {
		return new IntegerContainer<TInput>(new AddInteger<TInput>(this.getExpression(), new ConstantExecutor<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> subtract(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new SubtractInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> subtract(IScalarExecutor<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new SubtractInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> subtract(Integer value) {
		return new IntegerContainer<TInput>(new SubtractInteger<TInput>(this.getExpression(), new ConstantExecutor<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> multiply(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new MultiplyInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> multiply(IScalarExecutor<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new MultiplyInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> multiply(Integer value) {
		return new IntegerContainer<TInput>(new MultiplyInteger<TInput>(this.getExpression(), new ConstantExecutor<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> divideBy(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new DivideInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> divideBy(IScalarExecutor<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new DivideInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> divideBy(Integer value) {
		return new IntegerContainer<TInput>(new DivideInteger<TInput>(this.getExpression(), new ConstantExecutor<TInput, Integer>(value)));
	}
	
	
	public IntegerContainer<TInput> mod(IntegerContainer<TInput> expression) {
		return new IntegerContainer<TInput>(new ModInteger<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer<TInput> mod(IScalarExecutor<TInput, Integer> expression) {
		return new IntegerContainer<TInput>(new ModInteger<TInput>(this.getExpression(), expression));
	}
	
	public IntegerContainer<TInput> mod(Integer value) {
		return new IntegerContainer<TInput>(new ModInteger<TInput>(this.getExpression(), new ConstantExecutor<TInput, Integer>(value)));
	}


}
