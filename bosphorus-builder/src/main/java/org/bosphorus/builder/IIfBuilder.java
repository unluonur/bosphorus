package org.bosphorus.builder;

import org.bosphorus.builder.container.BaseTypeContainer;
import org.bosphorus.builder.container.BooleanContainer;
import org.bosphorus.expression.IExpression;

/*
 * TODO
 */
public class IIfBuilder {

	public class TrueBuilder {
		private IExpression<Boolean> condition;
		
		public TrueBuilder(IExpression<Boolean> condition) {
			this.condition = condition;
		}
		
		public FalseBuilder<Boolean, BooleanContainer> then(BooleanContainer trueExpression) {
			return new FalseBuilder<Boolean, BooleanContainer>(this.condition, trueExpression.getExpression(), BooleanContainer.class);
		}
		
	}
	
	public class FalseBuilder<TOutput extends Comparable<TOutput>, TGetter extends BaseTypeContainer<TOutput>> {
		private IExpression<Boolean> condition;
		private IExpression<TOutput> trueExpression;
		private Class clz;
		
		public FalseBuilder(IExpression<Boolean> condition, IExpression<TOutput> trueExpression, Class clz) {
			this.condition = condition;
			this.trueExpression = trueExpression;
			this.clz = clz;
		}
	}
}
