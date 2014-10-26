package org.jcep.core.stream;

import org.jcep.core.expressions.IExpression;

public class FilterNode<TType> implements IExecutor<TType> {
	
	private ICollector<TType> outputStream;
	private IExpression<TType, Boolean> filter;
	
	public ICollector<TType> getOutputStream() {
		return outputStream;
	}
	
	public void setOutputStream(ICollector<TType> outputStream) {
		this.outputStream = outputStream;
	}
	
	public IExpression<TType, Boolean> getFilter() {
		return filter;
	}
	
	public void setFilter(IExpression<TType, Boolean> filter) {
		this.filter = filter;
	}

	@Override
	public void execute(TType input) {
		if(!this.getFilter().execute(input)) {
			this.getOutputStream().collect(input);
		}
	}
	
}
