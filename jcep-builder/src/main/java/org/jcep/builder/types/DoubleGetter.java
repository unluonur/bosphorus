package org.jcep.builder.types;

import org.jcep.core.expressions.Constant;
import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.condition.LessThan;
import org.jcep.core.expressions.math.AddDouble;
import org.jcep.core.expressions.math.DivideDouble;
import org.jcep.core.expressions.math.MultiplyDouble;
import org.jcep.core.expressions.math.SubtractDouble;

public class DoubleGetter<TInput> extends BaseTypeGetter<TInput, Double> {

	public DoubleGetter(IExpression<TInput, Double> expression) {
		super(expression);
	}
	

	public DoubleGetter<TInput> add(DoubleGetter<TInput> expression) {
		return new DoubleGetter<TInput>(new AddDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleGetter<TInput> add(IExpression<TInput, Double> expression) {
		return new DoubleGetter<TInput>(new AddDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleGetter<TInput> add(Double value) {
		return new DoubleGetter<TInput>(new AddDouble<TInput>(this.getExpression(), new Constant<TInput, Double>(value)));
	}
	
	
	public DoubleGetter<TInput> subtract(DoubleGetter<TInput> expression) {
		return new DoubleGetter<TInput>(new SubtractDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleGetter<TInput> subtract(IExpression<TInput, Double> expression) {
		return new DoubleGetter<TInput>(new SubtractDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleGetter<TInput> subtract(Double value) {
		return new DoubleGetter<TInput>(new SubtractDouble<TInput>(this.getExpression(), new Constant<TInput, Double>(value)));
	}
	
	
	public DoubleGetter<TInput> multiply(DoubleGetter<TInput> expression) {
		return new DoubleGetter<TInput>(new MultiplyDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleGetter<TInput> multiply(IExpression<TInput, Double> expression) {
		return new DoubleGetter<TInput>(new MultiplyDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleGetter<TInput> multiply(Double value) {
		return new DoubleGetter<TInput>(new MultiplyDouble<TInput>(this.getExpression(), new Constant<TInput, Double>(value)));
	}
	
	
	public DoubleGetter<TInput> divideBy(DoubleGetter<TInput> expression) {
		return new DoubleGetter<TInput>(new DivideDouble<TInput>(this.getExpression(), expression.getExpression()));
	}
	
	public DoubleGetter<TInput> divideBy(IExpression<TInput, Double> expression) {
		return new DoubleGetter<TInput>(new DivideDouble<TInput>(this.getExpression(), expression));
	}
	
	public DoubleGetter<TInput> divideBy(Double value) {
		return new DoubleGetter<TInput>(new DivideDouble<TInput>(this.getExpression(), new Constant<TInput, Double>(value)));
	}
		
}
