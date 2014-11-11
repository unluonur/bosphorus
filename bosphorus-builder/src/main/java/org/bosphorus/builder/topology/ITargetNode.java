package org.bosphorus.builder.topology;

import org.bosphorus.stream.IStreamWriter;

public interface ITargetNode<TInput> extends INode {
	
	IStreamWriter<TInput> getWriter();

}
