package org.bosphorus.stream.pipe;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class Filter<TInput> implements IPipe<TInput> {
	
	private IScalarExecutor<TInput, Boolean> expression;
	private IPipe<TInput> outputStream;
	
	public Filter(IScalarExecutor<TInput, Boolean> expression, IPipe<TInput> outputStream) {
		this.expression = expression;
		this.outputStream = outputStream;
	}

	@Override
	public void writeOne(TInput input) throws Exception {
		if(expression.execute(input)) {
			outputStream.writeOne(input);
		}
	}

	@Override
	public void writeMulti(List<TInput> input) throws Exception {
		ArrayList<TInput> result = new ArrayList<TInput>();
		for(TInput item: input) {
			if(expression.execute(item)) {
				result.add(item);
			}
		}
		if(result.size()>0) {
			outputStream.writeMulti(result);
		}
	}
}
