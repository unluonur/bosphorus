package org.bosphorus.topology;

import java.util.List;

import org.bosphorus.stream.IWriter;
//import org.bosphorus.topology.builder.IStreamBuilder;
import org.bosphorus.topology.node.old.IBaseNode;
import org.bosphorus.topology.node.old.IReadNode;
import org.bosphorus.topology.node.old.IReadWriteNode;
import org.bosphorus.topology.node.old.IWriteNode;
import org.bosphorus.topology.stream.IReadWriteStream;
import org.bosphorus.topology.stream.IWriteStream;
import org.bosphorus.topology.stream.IReadStream;

public interface ITopology {
	
	<TInput> IWriteStream<TInput> createInputStream(String name, IWriteNode<TInput> input);
	
	<TOutput> IReadStream<TOutput> createOutputStream(String name, IReadNode<TOutput> output);
	
	<TInput, TOutput> IReadWriteStream<TInput, TOutput> createInputOutputStream(String name, IWriteNode<TInput> input, IReadNode<TOutput> output);
	
	
	<TInput> IWriteStream<TInput> getInputStream(String name);
	
	<TOutput> IReadStream<TOutput> getOutputStream(String name);
	
	<TInput, TOutput> IReadWriteStream<TInput, TOutput> getInputOutputStream(String name);
	
		
	<TInput> IWriteNode<TInput> createInputNode(IWriter<TInput> pipe, Integer parallelism);
	
	//<TOutput> IReadNode<TOutput> createOutputNode(IStreamBuilder<?, TOutput> pipe, Integer parallelism);
	
	//<TInput, TOutput> IReadWriteNode<TInput, TOutput> createInputOutputNode(IWriter<TInput> input, IStreamBuilder<?, TOutput> output, Integer parallelism);
	
	
	<TInput> IWriteNode<TInput> getInputNode(String name);
	
	<TOutput> IReadNode<TOutput> getOutputNode(String name);
	
	<TInput, TOutput> IReadWriteNode<TInput, TOutput> getInputOutputNode(String name);
	
	
	
	<TType> INodeBinding<TType> bind(IWriteNode<TType> source, Integer sourceIndex, IReadNode<TType> target, Integer targetIndex);
		
	
	List<IBaseNode> getNodes();
	List<INodeBinding<?>> getBindings();
	
	//List<IJoinBinding<?>> getJoins();
	
}
