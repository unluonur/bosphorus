package org.bosphorus.api.builder.node;

import java.util.HashMap;
import java.util.UUID;

import org.bosphorus.api.builder.stream.IStreamInput;
import org.bosphorus.api.builder.stream.IStreamOutput;
import org.bosphorus.api.builder.stream.RegisteredPipe;

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
	public <TType> IStreamInput<TType> streamInput(String id) {
		return (IStreamInput<TType>)inputs.get(id);
	}

	@Override
	public <TType> IStreamInput<TType> registerInput(IStreamInput<TType> pipe) {
		return registerInput(UUID.randomUUID().toString(), pipe);
	}

	@Override
	public <TType> IStreamInput<TType> registerInput(String id,
			IStreamInput<TType> pipe) {
		this.inputs.put(id, pipe);
		return new RegisteredPipe<TType>(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <TType> IStreamOutput<TType> streamOutput(String id) {
		return (IStreamOutput<TType>)outputs.get(id);
	}
	
	@Override
	public <TType> void registerOutput(String id, IStreamOutput<TType> output) {
		this.outputs.put(id, output);
	}

}
