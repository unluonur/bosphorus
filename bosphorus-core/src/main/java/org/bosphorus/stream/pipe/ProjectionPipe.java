package org.bosphorus.stream.pipe;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.stream.IWriter;

public class ProjectionPipe<TInput, TOutput> implements IWriter<TInput> {

	private IScalarExecutor<? super TInput, ? extends TOutput> expression;
	private IWriter<? super TOutput> outputStream;
	
	public ProjectionPipe(IScalarExecutor<? super TInput, ? extends TOutput> expression, 
			IWriter<? super TOutput> outputStream) {
		this.expression = expression;
		this.outputStream = outputStream;
	}

	@Override
	public void writeOne(TInput input) throws Exception {
		outputStream.writeOne(expression.execute(input));
	}

	@Override
	public void writeMulti(List<? extends TInput> input) throws Exception {
		ArrayList<TOutput> result = new ArrayList<TOutput>();
		for(TInput item: input) {
			result.add(expression.execute(item));
		}
		outputStream.writeMulti(result);
	}

}
