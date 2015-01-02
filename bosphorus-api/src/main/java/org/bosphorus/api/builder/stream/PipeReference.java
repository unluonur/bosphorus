package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.stream.IPipeExecutor;

public class PipeReference<TType> implements IStreamInput<TType> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public PipeReference(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public IPipeExecutor<TType> build(INodeContext context) throws Exception {
		return context.pipe(this.getName());
	}
}
