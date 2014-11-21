package org.bosphorus.topology;

import org.bosphorus.topology.node.IWriteNode;
import org.bosphorus.topology.node.IReadNode;

public interface INodeBinding<TType> {
	
	IReadNode<TType> getSourceNode();
	
	Integer getSourceIndex();
	
	IWriteNode<TType> getTargetNode();
	
	Integer getTargetIndex();
	
}
