package org.bosphorus.api.builder.node;

import java.io.Serializable;

import org.bosphorus.api.builder.stream.IStream;
import org.bosphorus.core.topology.ITopology;

public interface ITopologyBuilder extends Serializable {
	
	<TType> IStream<TType> stream(String name);
	
	/*
	
	<TType> IStreamInput<TType> streamInput(String name);
	//<TType> IStreamInput<TType> createInput(String name);
	<TType> void registerInput(String name, IStreamInput<TType> pipe);
	
	<TType> IStream<TType> streamOutput(String name);
	<TType> IStream<TType> createOutput(String name);
	//<TType> void registerOutput(String name, IStreamOutput<TType> output);
	*/
	
	ITopology build() throws Exception;

}
