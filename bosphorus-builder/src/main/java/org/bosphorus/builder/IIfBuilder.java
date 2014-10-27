package org.bosphorus.builder;

import org.bosphorus.builder.container.BaseTypeContainer;
import org.bosphorus.builder.container.BooleanContainer;
import org.bosphorus.expression.IExpression;

/*
 * TODO
 */
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
