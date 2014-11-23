package org.bosphorus.stream.pipe;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class Projection<TInput, TOutput> implements IPipe<TInput> {

	private IExpression<TInput, TOutput> expression;
	private IPipe<TOutput> outputStream;
	
	public Projection(IExpression<TInput, TOutput> expression, IPipe<TOutput> outputStream) {
		this.expression = expression;
		this.outputStream = outputStream;
	}

	@Override
	public void writeOne(TInput input) throws Exception {
		outputStream.writeOne(expression.execute(input));
	}

	@Override
	public void writeMulti(List<TInput> input) throws Exception {
		ArrayList<TOutput> result = new ArrayList<TOutput>();
		for(TInput item: input) {
			result.add(expression.execute(item));
		}
		outputStream.writeMulti(result);
	}

}
