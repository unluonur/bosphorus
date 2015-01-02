package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.stream.IPipeExecutor;

public class OneToManyPipe<TInput> implements IStreamInput<TInput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IStreamOutput<TInput> output;
	
	public OneToManyPipe() {
		this.output = new StreamOutput<TInput>();
	}

	public IStreamOutput<TInput> getOutput() {
		return output;
	}

	public void setOutput(IStreamOutput<TInput> output) {
		this.output = output;
	}

	@Override
	public IPipeExecutor<TInput> build(INodeContext context) throws Exception {
		return this.output.build(context);
	}

}
