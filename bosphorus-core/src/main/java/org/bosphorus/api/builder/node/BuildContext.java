package org.bosphorus.api.builder.node;


public abstract class BuildContext implements IBuildContext {
	/*
	private Map<String, ? extends IStreamInput<?>> pipes;
	private HashMap<String, IPipeExecutor<?>> executors;
	private ArrayList<String> running;
	private ArrayList<Thread> threads = new ArrayList<Thread>();
	
	public BuildContext(Map<String, ? extends IStreamInput<?>> pipes) {
		this.pipes = pipes;
		this.executors = new HashMap<String, IPipeExecutor<?>>();
		this.running = new ArrayList<String>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <TInput> IPipeExecutor<TInput> stream(String name) throws Exception {
		if(this.executors.containsKey(name)) {
			return (IPipeExecutor<TInput>)this.executors.get(name);
		}
		if(this.running.contains(name)) {
			//throw new Exception("Infinite loop detected");
			return new IPipeExecutor<TInput>() {
				@Override
				public void writeOne(TInput input) throws Exception {
					Thread thread = new Thread(new Runnable() {
						@Override
						public void run() {
							try {
								((IPipeExecutor<TInput>)executors.get(name)).writeOne(input);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					});
					threads.add(thread);
					thread.start();
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
		running.remove(running.indexOf(name));
		return result;
	}
	
	@Override
	public String toString() {
		return this.executors.toString() + " size : "+this.executors.size();
	}
*/
}
