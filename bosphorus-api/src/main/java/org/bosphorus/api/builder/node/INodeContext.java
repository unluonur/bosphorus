package org.bosphorus.api.builder.node;

import org.bosphorus.stream.IPipeExecutor;

public interface INodeContext {
	
	<TInput> IPipeExecutor<TInput> pipe(String id) throws Exception;
	
}
