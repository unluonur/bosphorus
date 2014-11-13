package org.bosphorus.topology.stream;

import org.bosphorus.topology.node.IInputNode;

public interface IInputStream<TInput> extends IBaseStream {

	IInputNode<TInput> getInput();
	
}
