package org.bosphorus.api.builder.node;

import java.io.Serializable;

import org.bosphorus.api.builder.stream.IStreamInput;
import org.bosphorus.api.builder.stream.IStreamOutput;

public interface INode extends Serializable {
	
	<TType> IStreamInput<TType> streamInput(String name);
	<TType> void registerInput(String name, IStreamInput<TType> pipe);
	
	<TType> IStreamOutput<TType> streamOutput(String name);
	<TType> void registerOutput(String name, IStreamOutput<TType> output);
	
	INodeContext build() throws Exception;

}
