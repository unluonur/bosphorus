package org.bosphorus.api.builder.stream;

import java.io.Serializable;

import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.stream.IPipeExecutor;

public interface IStreamOutput<TType> extends Serializable {
	
	void add(IStreamInput<TType> pipe);
	
	IPipeExecutor<TType> build(INodeContext context) throws Exception;

}
