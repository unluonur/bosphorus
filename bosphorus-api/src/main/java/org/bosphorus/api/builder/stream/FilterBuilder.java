package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.stream.IWriter;
import org.bosphorus.stream.pipe.FilterPipe;

public class FilterBuilder<TInput> implements IWriterBuilder<TInput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<? super TInput, Boolean> filter;
	private IWriterBuilder<? super TInput> output;

	@Override
	public IWriter<TInput> build() {
		return new FilterPipe<TInput>(filter.build(), output.build());
	}

}
