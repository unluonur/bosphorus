package org.bosphorus.api.builder.node;

import java.util.HashMap;

import org.bosphorus.api.builder.stream.IStream;

public abstract class TopologyBuilder implements ITopologyBuilder {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HashMap<String, IStream<?>> streams;
	/*
	private HashMap<String, IStreamInput<?>> inputs;
	private HashMap<String, IStream<?>> outputs;
	*/
	public TopologyBuilder() {
		/*
		this.inputs = new HashMap<String, IStreamInput<?>>();
		this.outputs = new HashMap<String, IStream<?>>();
		*/
		this.streams = new HashMap<String, IStream<?>>();
	}

	/*
	@Override
	public IBuildContext build() throws Exception {
		BuildContext context = new BuildContext(inputs);
		for(IStreamInput<?> pipe: inputs.values()) {
			System.out.println("pipe : "+pipe);
			pipe.build(context);
		}
		return context;
	}
	*/
	/*
	@Override
	public ITopology build() throws Exception {
		BuildContext context = new BuildContext(this.inputs);
		HashMap<String, IPipeExecutor<?>> streams = new HashMap<String, IPipeExecutor<?>>();

		for(String name: inputs.keySet()) {
			streams.put(name, inputs.get(name).build(context));
		}
		Topology topology = new Topology(streams);
		return topology;
	}
*/
	@Override
	public <TType> IStream<TType> stream(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	@Override
	public <TType> IStreamInput<TType> streamInput(String name) {
		return new StreamReference<TType>(name);
		//return (IStreamInput<TType>)inputs.get(name);
	}
	
	@Override
	public <TType> void registerInput(String name,
			IStreamInput<TType> pipe) {
		this.inputs.put(name, pipe);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <TType> IStream<TType> streamOutput(String name) {
		return (IStream<TType>)outputs.get(name);
	}

	@Override
	public <TType> IStream<TType> createOutput(String name) {
		Stream<TType> output = new Stream<TType>();
		this.outputs.put(name, output);
		return output;
	}
	*/
	
/*
	@Override
	public <TType> void registerOutput(String name, IStreamOutput<TType> output) {
		this.outputs.put(name, output);
	}
*/
}
