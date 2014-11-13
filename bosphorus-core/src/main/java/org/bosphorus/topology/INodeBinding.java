package org.bosphorus.topology;

import org.bosphorus.topology.node.IInputNode;
import org.bosphorus.topology.node.IOutputNode;

public interface INodeBinding<TType> {
	
	IOutputNode<TType> getSource();
	
	IInputNode<TType> getTarget();
	
}
