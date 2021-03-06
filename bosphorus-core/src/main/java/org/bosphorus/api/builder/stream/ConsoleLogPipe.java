package org.bosphorus.api.builder.stream;

import org.bosphorus.core.stream.IPipeExecutor;
import org.bosphorus.core.stream.pipe.ConsoleLogExecutor;

public class ConsoleLogPipe<TInput> implements IStreamInput<TInput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IPipeExecutor<TInput> build() throws Exception {
		return new ConsoleLogExecutor<TInput>();
	}

}
