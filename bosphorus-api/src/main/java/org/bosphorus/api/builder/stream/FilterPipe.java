package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.stream.IPipeExecutor;
import org.bosphorus.stream.pipe.FilterExecutor;

public class FilterPipe<TType> extends BaseSingleOutputStream<TType, TType> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression1<? super TType, Boolean> filter;
	
	public FilterPipe(IScalarExpression1<? super TType, Boolean> filter) {
		this.filter = filter;
	}

	@Override
	public IPipeExecutor<TType> build() throws Exception {
		return new FilterExecutor<TType>(filter.build(), this.getOutput().build());
	}

}
