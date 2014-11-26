package org.bosphorus.builder.old;

import org.bosphorus.builder.container.BaseTypeContainer;
import org.bosphorus.builder.container.BooleanContainer;
import org.bosphorus.expression.scalar.IScalarExecutor;

/*
 * TODO
 */
public class IIfBuilder<TInput> {

	public class TrueBuilder {
		private IScalarExecutor<TInput, Boolean> condition;
		
		public TrueBuilder(IScalarExecutor<TInput, Boolean> condition) {
			this.condition = condition;
		}

		public FalseBuilder<Boolean, BooleanContainer<TInput>> then(BooleanContainer<TInput> trueExpression) {
			return new FalseBuilder<Boolean, BooleanContainer<TInput>>(this.condition, trueExpression.getExpression(), BooleanContainer.class);
		}
		
	}
	
	public class FalseBuilder<TOutput extends Comparable<TOutput>, TGetter extends BaseTypeContainer<TInput, TOutput>> {
		private IScalarExecutor<TInput, Boolean> condition;
		private IScalarExecutor<TInput, TOutput> trueExpression;
		private Class clz;
		
		public FalseBuilder(IScalarExecutor<TInput, Boolean> condition, IScalarExecutor<TInput, TOutput> trueExpression, Class clz) {
			this.condition = condition;
			this.trueExpression = trueExpression;
			this.clz = clz;
		}
	}
}
