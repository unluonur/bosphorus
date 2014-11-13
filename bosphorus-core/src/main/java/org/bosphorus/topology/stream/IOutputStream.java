package org.bosphorus.topology.stream;

import org.bosphorus.topology.node.IOutputNode;

public interface IOutputStream<TOutput> extends IBaseStream {

	IOutputNode<TOutput> getOutput();

}
