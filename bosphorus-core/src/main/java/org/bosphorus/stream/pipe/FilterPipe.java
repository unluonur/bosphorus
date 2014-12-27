package org.bosphorus.stream.pipe;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.stream.IWriter;

public class FilterPipe<TInput> implements IWriter<TInput> {
	
	private IScalarExecutor<? super TInput, Boolean> expression;
	private IWriter<? super TInput> outputStream;
	
	public FilterPipe(IScalarExecutor<? super TInput, Boolean> expression, 
			IWriter<? super TInput> outputStream) {
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
	public void writeMulti(List<? extends TInput> input) throws Exception {
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
