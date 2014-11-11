package org.bosphorus.builder.topology;

import org.bosphorus.builder.stream.IStreamBuilder;

public interface IOutputNode<TOutput> extends INode {
	
	IStreamBuilder<?, TOutput> getInput();
	

}
