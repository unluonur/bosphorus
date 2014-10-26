package org.jcep.builder;

import org.jcep.builder.types.BaseTypeGetter;
import org.jcep.builder.types.BooleanGetter;
import org.jcep.core.expressions.IExpression;

public class IIfBuilder<TInput> {

	public class TrueBuilder {
		private IExpression<TInput, Boolean> condition;
		
		public TrueBuilder(IExpression<TInput, Boolean> condition) {
			this.condition = condition;
		}
		
		public FalseBuilder<Boolean, BooleanGetter<TInput>> then(BooleanGetter<TInput> trueExpression) {
			return new FalseBuilder<Boolean, BooleanGetter<TInput>>(this.condition, trueExpression.getExpression(), BooleanGetter.class);
		}
		
	}
	
	public class FalseBuilder<TOutput extends Comparable<TOutput>, TGetter extends BaseTypeGetter<TInput, TOutput>> {
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
