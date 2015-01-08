package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.stream.IPipeExecutor;
import org.bosphorus.stream.pipe.ProjectionExecutor;

public class ProjectionPipe<TInput, TOutput> extends BaseSingleOutputStream<TInput, TOutput> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<? super TInput, ? extends TOutput> expression;

	@Override
	public IPipeExecutor<TInput> build() throws Exception {
		return new ProjectionExecutor<TInput, TOutput>(expression.build(), this.getOutput().build());
	}

}
