package org.bosphorus.api.builder.stream;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.stream.IPipeExecutor;
import org.bosphorus.stream.pipe.FilterExecutor;

public class FilterPipe<TType> implements IStreamInput<TType> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<? super TType, Boolean> filter;
	private IStreamOutput<TType> output;
	
	public FilterPipe() {
		this.output = new StreamOutput<TType>();
	}
	
	public FilterPipe(IScalarExpression<? super TType, Boolean> filter) {
		this.output = new StreamOutput<TType>();
		this.filter = filter;
	}

	public IStreamOutput<TType> getOutput() {
		return output;
	}

	public void setOutput(IStreamOutput<TType> output) {
		this.output = output;
	}

	@Override
	public IPipeExecutor<TType> build(INodeContext context) throws Exception {
		return new FilterExecutor<TType>(filter.build(), this.getOutput().build(context));
	}

}
