package org.bosphorus.topology;

import org.bosphorus.topology.node.old.IReadNode;
import org.bosphorus.topology.node.old.IWriteNode;

public interface INodeBinding<TType> {
	
	IReadNode<TType> getSourceNode();
	
	Integer getSourceIndex();
	
	IWriteNode<TType> getTargetNode();
	
	Integer getTargetIndex();
	
}
