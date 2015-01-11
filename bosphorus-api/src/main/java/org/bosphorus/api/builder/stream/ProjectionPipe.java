package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.stream.IPipeExecutor;
import org.bosphorus.stream.pipe.ProjectionExecutor;

public class ProjectionPipe<TInput, TOutput> extends BaseSingleOutputStream<TInput, TOutput> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression1<? super TInput, ? extends TOutput> expression;

	@Override
	public IPipeExecutor<TInput> build() throws Exception {
		return new ProjectionExecutor<TInput, TOutput>(expression.build().create(), this.getOutput().build());
	}

}
