package org.bosphorus.pipe;

import org.bosphorus.expression.IExpression;

public class Filter<TInput> extends BasePipe<TInput> {
	
	private IExpression<TInput, Boolean> expression;
	private IPipe<TInput> outputStream;
	
	public Filter(IExpression<TInput, Boolean> expression, IPipe<TInput> outputStream) {
		this.expression = expression;
		this.outputStream = outputStream;
	}

	@Override
	public void write(TInput input) throws Exception {
		if(expression.execute(input)) {
			outputStream.write(input);
		}
	}
}
