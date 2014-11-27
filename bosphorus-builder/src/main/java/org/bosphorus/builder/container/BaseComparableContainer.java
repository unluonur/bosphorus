package org.bosphorus.builder.container;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.common.ConstantExecutor;
import org.bosphorus.expression.scalar.executor.condition.Equals;
import org.bosphorus.expression.scalar.executor.condition.GreaterThan;
import org.bosphorus.expression.scalar.executor.condition.GreaterThanOrEqual;
import org.bosphorus.expression.scalar.executor.condition.In;
import org.bosphorus.expression.scalar.executor.condition.LessThan;
import org.bosphorus.expression.scalar.executor.condition.LessThanOrEqual;
import org.bosphorus.expression.scalar.executor.condition.NotEquals;
import org.bosphorus.expression.scalar.executor.condition.NotIn;

public abstract class BaseComparableContainer<TInput, TOutput extends Comparable<TOutput>> extends BaseTypeContainer<TInput, TOutput> {
	
	public BaseComparableContainer(IScalarExecutor<TInput, TOutput> expression) {
		super(expression);
	}
	
	public BooleanContainer<TInput> isEqualTo(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new Equals<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isEqualTo(TOutput value) {
		return new BooleanContainer<TInput>(new Equals<TInput, TOutput>(this.getExpression(), new ConstantExecutor<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isEqualTo(IScalarExecutor<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new Equals<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isNotEqualTo(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new NotEquals<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isNotEqualTo(TOutput value) {
		return new BooleanContainer<TInput>(new NotEquals<TInput, TOutput>(this.getExpression(), new ConstantExecutor<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isNotEqualTo(IScalarExecutor<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new NotEquals<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isLessThan(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new LessThan<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isLessThan(TOutput value) {
		return new BooleanContainer<TInput>(new LessThan<TInput, TOutput>(this.getExpression(), new ConstantExecutor<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isLessThan(IScalarExecutor<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new LessThan<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isLessThanOrEqualsTo(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new LessThanOrEqual<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isLessThanOrEqualsTo(TOutput value) {
		return new BooleanContainer<TInput>(new LessThanOrEqual<TInput, TOutput>(this.getExpression(), new ConstantExecutor<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isLessThanOrEqualsTo(IScalarExecutor<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new LessThanOrEqual<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isGreaterThan(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new GreaterThan<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isGreaterThan(TOutput value) {
		return new BooleanContainer<TInput>(new GreaterThan<TInput, TOutput>(this.getExpression(), new ConstantExecutor<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isGreaterThan(IScalarExecutor<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new GreaterThan<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isGreaterThanOrEqualsTo(BaseComparableContainer<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new GreaterThanOrEqual<TInput, TOutput>(this.getExpression(), value.getExpression()));
	}
	
	public BooleanContainer<TInput> isGreaterThanOrEqualsTo(TOutput value) {
		return new BooleanContainer<TInput>(new GreaterThanOrEqual<TInput, TOutput>(this.getExpression(), new ConstantExecutor<TInput, TOutput>(value)));
	}
	
	public BooleanContainer<TInput> isGreaterThanOrEqualsTo(IScalarExecutor<TInput, TOutput> value) {
		return new BooleanContainer<TInput>(new GreaterThanOrEqual<TInput, TOutput>(this.getExpression(), value));
	}
	
	public BooleanContainer<TInput> isIn(List<TOutput> list) {
		return new BooleanContainer<TInput>(new In<TInput, TOutput>(this.getExpression(), new ConstantExecutor<TInput, List<TOutput>>(list)));
	}

	public BooleanContainer<TInput> isNotIn(List<TOutput> list) {
		return new BooleanContainer<TInput>(new NotIn<TInput, TOutput>(this.getExpression(), new ConstantExecutor<TInput, List<TOutput>>(list)));
	}

}
