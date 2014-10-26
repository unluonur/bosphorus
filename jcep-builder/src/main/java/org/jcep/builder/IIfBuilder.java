package org.jcep.builder;

import org.jcep.builder.types.BaseTypeContainer;
import org.jcep.builder.types.BooleanContainer;
import org.jcep.core.expressions.IExpression;

public class IIfBuilder<TInput> {

	public class TrueBuilder {
		private IExpression<TInput, Boolean> condition;
		
		public TrueBuilder(IExpression<TInput, Boolean> condition) {
			this.condition = condition;
		}
		
		public FalseBuilder<Boolean, BooleanContainer<TInput>> then(BooleanContainer<TInput> trueExpression) {
			return new FalseBuilder<Boolean, BooleanContainer<TInput>>(this.condition, trueExpression.getExpression(), BooleanContainer.class);
		}
		
	}
	
	public class FalseBuilder<TOutput extends Comparable<TOutput>, TGetter extends BaseTypeContainer<TInput, TOutput>> {
		private IExpression<TInput, Boolean> condition;
		private IExpression<TInput, TOutput> trueExpression;
		private Class clz;
		
		public FalseBuilder(IExpression<TInput, Boolean> condition, IExpression<TInput, TOutput> trueExpression, Class clz) {
			this.condition = condition;
			this.trueExpression = trueExpression;
			this.clz = clz;
		}
	}
}
