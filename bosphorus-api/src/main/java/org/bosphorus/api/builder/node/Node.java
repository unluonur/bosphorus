package org.bosphorus.api.builder.node;

import java.util.HashMap;

import org.bosphorus.api.builder.stream.IStreamInput;
import org.bosphorus.api.builder.stream.IStreamOutput;

public class Node implements INode {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HashMap<String, IStreamInput<?>> inputs;
	private HashMap<String, IStreamOutput<?>> outputs;
	
	public Node() {
		this.inputs = new HashMap<String, IStreamInput<?>>();
		this.outputs = new HashMap<String, IStreamOutput<?>>();
	}

	@Override
	public INodeContext build() throws Exception {
		NodeContext context = new NodeContext(inputs);
		for(IStreamInput<?> pipe: inputs.values()) {
			pipe.build(context);
		}
		return context;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <TType> IStreamInput<TType> streamInput(String name) {
		return (IStreamInput<TType>)inputs.get(name);
	}

	@Override
	public <TType> void registerInput(String name,
			IStreamInput<TType> pipe) {
		this.inputs.put(name, pipe);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <TType> IStreamOutput<TType> streamOutput(String name) {
		return (IStreamOutput<TType>)outputs.get(name);
	}
	
	@Override
	public <TType> void registerOutput(String name, IStreamOutput<TType> output) {
		this.outputs.put(name, output);
	}

}
