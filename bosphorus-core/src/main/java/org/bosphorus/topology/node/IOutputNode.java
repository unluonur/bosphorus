package org.bosphorus.topology.node;

import org.bosphorus.topology.builder.IStreamBuilder;

public interface IOutputNode<TOutput> extends IBaseNode {
	
	IStreamBuilder<?, TOutput> getInput();

}
