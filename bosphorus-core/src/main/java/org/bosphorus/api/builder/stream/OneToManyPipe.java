package org.bosphorus.api.builder.stream;

import org.bosphorus.core.stream.IPipeExecutor;

public class OneToManyPipe<TInput> extends BaseSingleOutputStream<TInput, TInput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public IPipeExecutor<TInput> build() throws Exception {
		return this.getOutput().build();
	}

}
