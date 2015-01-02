package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.stream.IPipeExecutor;
import org.bosphorus.stream.pipe.ConsoleLogExecutor;

public class ConsoleLogPipe<TInput> implements IStreamInput<TInput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IPipeExecutor<TInput> build(INodeContext context) throws Exception {
		return new ConsoleLogExecutor<TInput>();
	}

}
