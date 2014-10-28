package org.bosphorus.builder.container;

import org.bosphorus.expression.Constant;
import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.math.AddLong;
import org.bosphorus.expression.math.DivideLong;
import org.bosphorus.expression.math.ModLong;
import org.bosphorus.expression.math.MultiplyLong;
import org.bosphorus.expression.math.SubtractLong;

public class LongContainer extends BaseComparableContainer<Long> {

	public LongContainer(IExpression<Long> expression) {
		super(expression);
	}
	
	public LongContainer add(LongContainer expression) {
		return new LongContainer(new AddLong(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer add(IExpression<Long> expression) {
		return new LongContainer(new AddLong(this.getExpression(), expression));
	}
	
	public LongContainer add(Long value) {
		return new LongContainer(new AddLong(this.getExpression(), new Constant<Long>(value)));
	}
	
	
	public LongContainer subtract(LongContainer expression) {
		return new LongContainer(new SubtractLong(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer subtract(IExpression<Long> expression) {
		return new LongContainer(new SubtractLong(this.getExpression(), expression));
	}
	
	public LongContainer subtract(Long value) {
		return new LongContainer(new SubtractLong(this.getExpression(), new Constant<Long>(value)));
	}
	
	
	public LongContainer multiply(LongContainer expression) {
		return new LongContainer(new MultiplyLong(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer multiply(IExpression<Long> expression) {
		return new LongContainer(new MultiplyLong(this.getExpression(), expression));
	}
	
	public LongContainer multiply(Long value) {
		return new LongContainer(new MultiplyLong(this.getExpression(), new Constant<Long>(value)));
	}
	
	
	public LongContainer divideBy(LongContainer expression) {
		return new LongContainer(new DivideLong(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer divideBy(IExpression<Long> expression) {
		return new LongContainer(new DivideLong(this.getExpression(), expression));
	}
	
	public LongContainer divideBy(Long value) {
		return new LongContainer(new DivideLong(this.getExpression(), new Constant<Long>(value)));
	}
	
	
	public LongContainer mod(LongContainer expression) {
		return new LongContainer(new ModLong(this.getExpression(), expression.getExpression()));
	}
	
	public LongContainer mod(IExpression<Long> expression) {
		return new LongContainer(new ModLong(this.getExpression(), expression));
	}
	
	public LongContainer mod(Long value) {
		return new LongContainer(new ModLong(this.getExpression(), new Constant<Long>(value)));
	}
	
}
