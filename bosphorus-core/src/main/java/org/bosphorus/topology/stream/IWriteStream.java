package org.bosphorus.topology.stream;

import org.bosphorus.topology.node.IWriteNode;

public interface IWriteStream<TInput> extends IBaseStream {

	IWriteNode<TInput> getInput();
	
}
