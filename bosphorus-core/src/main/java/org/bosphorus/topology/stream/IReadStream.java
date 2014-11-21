package org.bosphorus.topology.stream;

import org.bosphorus.topology.node.IReadNode;

public interface IReadStream<TOutput> extends IBaseStream {

	IReadNode<TOutput> getOutput();

}
