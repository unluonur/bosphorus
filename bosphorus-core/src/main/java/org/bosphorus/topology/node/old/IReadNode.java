package org.bosphorus.topology.node.old;

import java.util.List;

import org.bosphorus.stream.IWriter;

public interface IReadNode<TOutput> extends IBaseNode {
	
	// List<IStreamBuilder<?, TOutput>> getOutputs();
	
	List<IStreamDefinition> defineOutput();
	
	void setOutputs(List<IWriter<TOutput>> writers);

}
