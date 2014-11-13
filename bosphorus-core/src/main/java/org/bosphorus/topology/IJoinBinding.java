package org.bosphorus.topology;

import java.util.List;

import org.bosphorus.topology.node.IJoinNode;
import org.bosphorus.topology.node.IOutputNode;

public interface IJoinBinding<TType> {
	
	List<IOutputNode<TType>> getSources();
	
	IJoinNode<TType> getTarget();
}
