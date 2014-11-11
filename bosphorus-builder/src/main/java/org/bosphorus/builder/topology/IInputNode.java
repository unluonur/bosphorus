package org.bosphorus.builder.topology;

import org.bosphorus.builder.stream.IStreamBuilder;

public interface IInputNode<TInput> extends INode {
	
	IStreamBuilder<TInput, ?> getInput();

}
