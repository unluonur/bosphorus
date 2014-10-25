package org.jcep.builder.types;

import org.jcep.core.expressions.common.Constant;
import org.jcep.core.expressions.common.IExpression;
import org.jcep.core.expressions.condition.LessThan;
import org.jcep.core.expressions.math.AddDouble;
import org.jcep.core.expressions.math.DivideDouble;
import org.jcep.core.expressions.math.MultiplyDouble;
import org.jcep.core.expressions.math.SubtractDouble;

public class DoubleGetter<TContext> extends BaseTypeGetter<Double, TContext> {

	public DoubleGetter(IExpression<Double, TContext> expression) {
		super(expression);
	}
	

	public DoubleGetter<TContext> add(DoubleGetter<TContext> expression) {
		return new DoubleGetter<TContext>(new AddDouble<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleGetter<TContext> add(IExpression<Double, TContext> expression) {
		return new DoubleGetter<TContext>(new AddDouble<TContext>(this.getExpression(), expression));
	}
	
	public DoubleGetter<TContext> add(Double value) {
		return new DoubleGetter<TContext>(new AddDouble<TContext>(this.getExpression(), new Constant<Double, TContext>(value)));
	}
	
	
	public DoubleGetter<TContext> subtract(DoubleGetter<TContext> expression) {
		return new DoubleGetter<TContext>(new SubtractDouble<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleGetter<TContext> subtract(IExpression<Double, TContext> expression) {
		return new DoubleGetter<TContext>(new SubtractDouble<TContext>(this.getExpression(), expression));
	}
	
	public DoubleGetter<TContext> subtract(Double value) {
		return new DoubleGetter<TContext>(new SubtractDouble<TContext>(this.getExpression(), new Constant<Double, TContext>(value)));
	}
	
	
	public DoubleGetter<TContext> multiply(DoubleGetter<TContext> expression) {
		return new DoubleGetter<TContext>(new MultiplyDouble<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleGetter<TContext> multiply(IExpression<Double, TContext> expression) {
		return new DoubleGetter<TContext>(new MultiplyDouble<TContext>(this.getExpression(), expression));
	}
	
	public DoubleGetter<TContext> multiply(Double value) {
		return new DoubleGetter<TContext>(new MultiplyDouble<TContext>(this.getExpression(), new Constant<Double, TContext>(value)));
	}
	
	
	public DoubleGetter<TContext> divideBy(DoubleGetter<TContext> expression) {
		return new DoubleGetter<TContext>(new DivideDouble<TContext>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleGetter<TContext> divideBy(IExpression<Double, TContext> expression) {
		return new DoubleGetter<TContext>(new DivideDouble<TContext>(this.getExpression(), expression));
	}
	
	public DoubleGetter<TContext> divideBy(Double value) {
		return new DoubleGetter<TContext>(new DivideDouble<TContext>(this.getExpression(), new Constant<Double, TContext>(value)));
	}
		
}
