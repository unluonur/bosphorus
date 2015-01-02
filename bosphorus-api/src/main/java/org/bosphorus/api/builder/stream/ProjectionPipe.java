package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.stream.IPipeExecutor;
import org.bosphorus.stream.pipe.ProjectionExecutor;

public class ProjectionPipe<TInput, TOutput> implements IStreamInput<TInput> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<? super TInput, ? extends TOutput> expression;
	private IStreamOutput<TOutput> output;
	
	public ProjectionPipe() {
		this.setOutput(new StreamOutput<TOutput>());
	}

	public IStreamOutput<TOutput> getOutput() {
		return output;
	}

	public void setOutput(IStreamOutput<TOutput> output) {
		this.output = output;
	}

	@Override
	public IPipeExecutor<TInput> build(INodeContext context) throws Exception {
		return new ProjectionExecutor<TInput, TOutput>(expression.build(), this.getOutput().build(context));
	}

}
