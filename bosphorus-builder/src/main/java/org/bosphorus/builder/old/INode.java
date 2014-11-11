package org.bosphorus.builder.old;

import java.util.List;

import org.bosphorus.stream.IStreamWriter;

public interface INode {
	
	String getId();
	
	Integer getParallelism();

	IEndPoint getInput();

	IEndPoint getOutput();

}
