package org.bosphorus.topology.node.old;

import java.util.List;

import org.bosphorus.stream.pipe.IPipe;

public interface IReadWriteNode<TInput, TOutput> extends IWriteNode<TInput>, IReadNode<TOutput> {
	
	List<IPipe<TInput>> getInput(List<IPipe<TInput>> output);
}
