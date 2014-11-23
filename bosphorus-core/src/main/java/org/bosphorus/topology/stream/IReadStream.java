package org.bosphorus.topology.stream;

import org.bosphorus.topology.node.old.IReadNode;

public interface IReadStream<TOutput> extends IBaseStream {

	IReadNode<TOutput> getOutput();

}
