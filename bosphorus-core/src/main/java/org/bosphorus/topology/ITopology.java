package org.bosphorus.topology;

import java.util.List;
import java.util.function.IntBinaryOperator;

import org.bosphorus.pipe.IPipe;
import org.bosphorus.topology.builder.IStreamBuilder;
import org.bosphorus.topology.node.IInputNode;
import org.bosphorus.topology.node.IInputOutputNode;
import org.bosphorus.topology.node.IJoinNode;
import org.bosphorus.topology.node.IOutputNode;
import org.bosphorus.topology.stream.IBaseStream;
import org.bosphorus.topology.stream.IInputOutputStream;
import org.bosphorus.topology.stream.IInputStream;
import org.bosphorus.topology.stream.IOutputStream;

public interface ITopology {
	
	<TInput> IInputStream<TInput> createInputStream(String name, IInputNode<TInput> input);
	
	<TOutput> IOutputStream<TOutput> createOutputStream(String name, IOutputNode<TOutput> output);
	
	<TInput, TOutput> IInputOutputStream<TInput, TOutput> createInputOutputStream(String name, IInputNode<TInput> input, IOutputNode<TOutput> output);
	
	<TInput> IInputStream<TInput> getInputStream(String name);
	
	<TOutput> IOutputStream<TOutput> getOutputStream(String name);
	
	<TInput, TOutput> IInputOutputStream<TInput, TOutput> getInputOutputStream(String name);
	
		
	<TInput> IInputNode<TInput> createInputNode(IPipe<TInput> pipe);
	
	<TOutput> IOutputNode<TOutput> createOutputNode(IStreamBuilder<?, TOutput> pipe);
	
	<TInput, TOutput> IInputOutputNode<TInput, TOutput> createInputOutputNode(IPipe<TInput> input, IStreamBuilder<?, TOutput> output);
	
	
	
		
	<TType> INodeBinding<TType> bind(IInputNode<TType> source, IOutputNode<TType> target);
	
	<TType> IJoinBinding<TType> join(List<IOutputNode<TType>> sources, IJoinNode<TType> target);
	
	
	List<INodeBinding<?>> getBindings();
	
	List<IJoinBinding<?>> getJoins();
	
}
