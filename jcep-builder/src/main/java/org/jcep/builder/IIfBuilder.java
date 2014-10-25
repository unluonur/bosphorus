package org.jcep.builder;

import org.jcep.builder.types.BaseTypeGetter;
import org.jcep.builder.types.BooleanGetter;
import org.jcep.core.expressions.IExpression;

public class IIfBuilder<TContext> {

	public class TrueBuilder {
		private IExpression<Boolean, TContext> condition;
		public TrueBuilder(IExpression<Boolean, TContext> condition) {
			this.condition = condition;
		}
		
		public FalseBuilder<Boolean, BooleanGetter<TContext>> then(BooleanGetter<TContext> trueExpression) {
			return new FalseBuilder<Boolean, BooleanGetter<TContext>>(this.condition, trueExpression.getExpression(), BooleanGetter.class);
		}
		
	}
	
	public class FalseBuilder<TType extends Comparable<TType>, TGetter extends BaseTypeGetter<TType, TContext>> {
		private IExpression<Boolean, TContext> condition;
		private IExpression<TType, TContext> trueExpression;
		private Class clz;
		
		public FalseBuilder(IExpression<Boolean, TContext> condition, IExpression<TType, TContext> trueExpression, Class clz) {
			this.condition = condition;
			this.trueExpression = trueExpression;
			this.clz = clz;
		}
	}
}
