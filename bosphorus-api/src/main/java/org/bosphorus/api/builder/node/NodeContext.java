package org.bosphorus.api.builder.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;

import javax.swing.Timer;

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
	public <TInput> IPipeExecutor<TInput> pipe(String name) throws Exception {
		if(this.executors.containsKey(name)) {
			return (IPipeExecutor<TInput>)this.executors.get(name);
		}
		if(this.running.contains(name)) {
			//throw new Exception("Infinite loop detected");
			return new IPipeExecutor<TInput>() {
				@Override
				public void writeOne(TInput input) throws Exception {
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							try {
								((IPipeExecutor<TInput>)executors.get(name)).writeOne(input);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}).start();
					//((IPipeExecutor<TInput>)executors.get(name)).writeOne(input);
				}

				@Override
				public void writeMulti(List<? extends TInput> input)
						throws Exception {
					((IPipeExecutor<TInput>)executors.get(name)).writeMulti(input);
				}
			};
		}
		running.add(name);
		IPipeExecutor<TInput> result = (IPipeExecutor<TInput>)this.pipes.get(name).build(this);
		executors.put(name, result);
		running.remove(name);
		return result;
	}

}
