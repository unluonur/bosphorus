package org.bosphorus.api.builder.stream;

import java.io.Serializable;

import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.stream.IPipeExecutor;

public interface IStreamInput<TInput> extends Serializable {
	
	IPipeExecutor<TInput> build(INodeContext context) throws Exception;
	
}