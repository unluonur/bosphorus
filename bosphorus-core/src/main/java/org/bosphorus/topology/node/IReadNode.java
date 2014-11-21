package org.bosphorus.topology.node;

import java.util.List;

import org.bosphorus.stream.pipe.IPipe;

public interface IReadNode<TOutput> extends IBaseNode {
	
	// List<IStreamBuilder<?, TOutput>> getOutputs();
	
	List<IStreamDefinition> defineOutput();
	
	void setOutputs(List<IPipe<TOutput>> writers);

}
