package org.bosphorus.builder.old;

import java.util.List;

public interface INode {
	
	String getId();
	
	Integer getParallelism();

	IEndPoint getInput();

	IEndPoint getOutput();

}
