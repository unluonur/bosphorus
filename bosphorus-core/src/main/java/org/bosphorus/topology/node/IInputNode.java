package org.bosphorus.topology.node;

import org.bosphorus.pipe.IPipe;

public interface IInputNode<TInput> extends IBaseNode {
	
	IPipe<TInput> getWriter();

}
