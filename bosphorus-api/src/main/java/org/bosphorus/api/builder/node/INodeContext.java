package org.bosphorus.api.builder.node;

import org.bosphorus.stream.IPipeExecutor;

public interface INodeContext {
	
	<TInput> IPipeExecutor<TInput> pipe(String name) throws Exception;
	
}
