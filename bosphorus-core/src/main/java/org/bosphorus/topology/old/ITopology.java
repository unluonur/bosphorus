/**
 * Copyright (c) Onur Ünlü
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The latest version of this file can be found at https://github.com/unluonur/bosphorus
 */

package org.bosphorus.topology.old;

import java.util.List;

import org.bosphorus.stream.IPipeExecutor;
//import org.bosphorus.topology.builder.IStreamBuilder;
import org.bosphorus.topology.old.node.old.IBaseNode;
import org.bosphorus.topology.old.node.old.IReadNode;
import org.bosphorus.topology.old.node.old.IReadWriteNode;
import org.bosphorus.topology.old.node.old.IWriteNode;
import org.bosphorus.topology.old.stream.IReadStream;
import org.bosphorus.topology.old.stream.IReadWriteStream;
import org.bosphorus.topology.old.stream.IWriteStream;

public interface ITopology {
	
	<TInput> IWriteStream<TInput> createInputStream(String name, IWriteNode<TInput> input);
	
	<TOutput> IReadStream<TOutput> createOutputStream(String name, IReadNode<TOutput> output);
	
	<TInput, TOutput> IReadWriteStream<TInput, TOutput> createInputOutputStream(String name, IWriteNode<TInput> input, IReadNode<TOutput> output);
	
	
	<TInput> IWriteStream<TInput> getInputStream(String name);
	
	<TOutput> IReadStream<TOutput> getOutputStream(String name);
	
	<TInput, TOutput> IReadWriteStream<TInput, TOutput> getInputOutputStream(String name);
	
		
	<TInput> IWriteNode<TInput> createInputNode(IPipeExecutor<TInput> pipe, Integer parallelism);
	
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
