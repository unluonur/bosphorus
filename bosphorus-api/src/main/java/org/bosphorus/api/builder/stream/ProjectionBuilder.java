package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.stream.IWriter;
import org.bosphorus.stream.pipe.ProjectionPipe;

public class ProjectionBuilder<TInput, TOutput> implements IWriterBuilder<TInput> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<? super TInput, ? extends TOutput> expression;
	private IWriterBuilder<? super TOutput> output;

	@Override
	public IWriter<TInput> build() {
		return new ProjectionPipe<TInput, TOutput>(expression.build(), output.build());
	}

}
