package org.bosphorus.api.builder.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bosphorus.api.builder.stream.IStreamInput;
import org.bosphorus.stream.IPipeExecutor;

public class NodeContext implements INodeContext {
	private Map<String, ? extends IStreamInput<?>> pipes;
	private HashMap<String, IPipeExecutor<?>> executors;
	private ArrayList<String> running;
	
	public NodeContext(Map<String, ? extends IStreamInput<?>> pipes) {
		this.pipes = pipes;
		this.executors = new HashMap<String, IPipeExecutor<?>>();
		this.running = new ArrayList<String>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <TInput> IPipeExecutor<TInput> pipe(String id) throws Exception {
		if(this.executors.containsKey(id)) {
			return (IPipeExecutor<TInput>)this.executors.get(id);
		}
		if(this.running.contains(id)) {
			return new IPipeExecutor<TInput>() {
				@Override
				public void writeOne(TInput input) throws Exception {
					((IPipeExecutor<TInput>)executors.get(id)).writeOne(input);
				}

				@Override
				public void writeMulti(List<? extends TInput> input)
						throws Exception {
					((IPipeExecutor<TInput>)executors.get(id)).writeMulti(input);
				}
			};
		}
		running.add(id);
		IPipeExecutor<TInput> result = (IPipeExecutor<TInput>)this.pipes.get(id).build(this);
		executors.put(id, result);
		running.remove(id);
		return result;
	}

}
