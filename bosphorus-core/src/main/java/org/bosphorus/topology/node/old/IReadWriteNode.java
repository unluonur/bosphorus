package org.bosphorus.topology.node.old;

import java.util.List;

import org.bosphorus.stream.IWriter;

public interface IReadWriteNode<TInput, TOutput> extends IWriteNode<TInput>, IReadNode<TOutput> {
	
	List<IWriter<TInput>> getInput(List<IWriter<TInput>> output);
}
