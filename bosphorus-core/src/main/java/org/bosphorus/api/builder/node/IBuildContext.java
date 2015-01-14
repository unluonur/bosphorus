package org.bosphorus.api.builder.node;

import org.bosphorus.core.stream.IPipeExecutor;

public interface IBuildContext {
	
	<TInput> IPipeExecutor<TInput> stream(String name) throws Exception;
	
}
