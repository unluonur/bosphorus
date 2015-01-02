package org.bosphorus.api.builder.node;

import java.io.Serializable;

import org.bosphorus.api.builder.stream.IStreamInput;
import org.bosphorus.api.builder.stream.IStreamOutput;

public interface INode extends Serializable {
	
	<TType> IStreamInput<TType> streamInput(String id);
	<TType> IStreamInput<TType> registerInput(IStreamInput<TType> pipe);
	<TType> IStreamInput<TType> registerInput(String id, IStreamInput<TType> pipe);
	
	<TType> IStreamOutput<TType> streamOutput(String id);
	<TType> void registerOutput(String name, IStreamOutput<TType> output);
	
	INodeContext build() throws Exception;

}
