package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.stream.IPipeExecutor;

public class RegisteredPipe<TType> implements IStreamInput<TType> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	public RegisteredPipe(String id) {
		this.setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public IPipeExecutor<TType> build(INodeContext context) throws Exception {
		return context.pipe(this.getId());
	}
}
