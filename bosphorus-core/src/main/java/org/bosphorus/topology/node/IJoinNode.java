package org.bosphorus.topology.node;

import java.util.List;

import org.bosphorus.topology.builder.IStreamBuilder;

public interface IJoinNode<TInput> extends IOutputNode<List<TInput>> {
	
	List<IStreamBuilder<TInput, TInput>> getInputs();

}
