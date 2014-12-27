package org.bosphorus.topology.node.old;

import java.util.List;

import org.bosphorus.stream.IWriter;

public interface IWriteNode<TInput> extends IBaseNode {
	
	List<IStreamDefinition> defineInput();

	List<IWriter<TInput>> getInputs();

}
