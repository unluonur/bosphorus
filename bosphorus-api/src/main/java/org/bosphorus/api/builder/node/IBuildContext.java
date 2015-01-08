package org.bosphorus.api.builder.node;

import org.bosphorus.stream.IPipeExecutor;

public interface IBuildContext {
	
	<TInput> IPipeExecutor<TInput> stream(String name) throws Exception;
	
}
