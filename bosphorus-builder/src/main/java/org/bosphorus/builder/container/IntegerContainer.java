package org.bosphorus.builder.container;

import org.bosphorus.expression.Constant;
import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.math.AddInteger;
import org.bosphorus.expression.math.DivideInteger;
import org.bosphorus.expression.math.ModInteger;
import org.bosphorus.expression.math.MultiplyInteger;
import org.bosphorus.expression.math.SubtractInteger;

public class IntegerContainer extends BaseComparableContainer<Integer> {

	public IntegerContainer(IExpression<Integer> expression) {
		super(expression);
	}
	
	public IntegerContainer add(IntegerContainer expression) {
		return new IntegerContainer(new AddInteger(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer add(IExpression<Integer> expression) {
		return new IntegerContainer(new AddInteger(this.getExpression(), expression));
	}
	
	public IntegerContainer add(Integer value) {
		return new IntegerContainer(new AddInteger(this.getExpression(), new Constant<Integer>(value)));
	}
	
	
	public IntegerContainer subtract(IntegerContainer expression) {
		return new IntegerContainer(new SubtractInteger(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer subtract(IExpression<Integer> expression) {
		return new IntegerContainer(new SubtractInteger(this.getExpression(), expression));
	}
	
	public IntegerContainer subtract(Integer value) {
		return new IntegerContainer(new SubtractInteger(this.getExpression(), new Constant<Integer>(value)));
	}
	
	
	public IntegerContainer multiply(IntegerContainer expression) {
		return new IntegerContainer(new MultiplyInteger(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer multiply(IExpression<Integer> expression) {
		return new IntegerContainer(new MultiplyInteger(this.getExpression(), expression));
	}
	
	public IntegerContainer multiply(Integer value) {
		return new IntegerContainer(new MultiplyInteger(this.getExpression(), new Constant<Integer>(value)));
	}
	
	
	public IntegerContainer divideBy(IntegerContainer expression) {
		return new IntegerContainer(new DivideInteger(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer divideBy(IExpression<Integer> expression) {
		return new IntegerContainer(new DivideInteger(this.getExpression(), expression));
	}
	
	public IntegerContainer divideBy(Integer value) {
		return new IntegerContainer(new DivideInteger(this.getExpression(), new Constant<Integer>(value)));
	}
	
	
	public IntegerContainer mod(IntegerContainer expression) {
		return new IntegerContainer(new ModInteger(this.getExpression(), expression.getExpression()));
	}
	
	public IntegerContainer mod(IExpression<Integer> expression) {
		return new IntegerContainer(new ModInteger(this.getExpression(), expression));
	}
	
	public IntegerContainer mod(Integer value) {
		return new IntegerContainer(new ModInteger(this.getExpression(), new Constant<Integer>(value)));
	}


}
