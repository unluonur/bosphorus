package org.bosphorus.stream;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class Filter<TInput> implements IStreamWriter<TInput> {
	private IExpression<TInput, Boolean> expression;
	private IStreamWriter<TInput> outputStream;
	
	public Filter(IExpression<TInput, Boolean> expression, IStreamWriter<TInput> outputStream) {
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
		for(TInput data: input) {
			if(expression.execute(data)) {
				result.add(data);
			}
		}
		if(result.size()>0) {
			outputStream.writeMulti(result);
		}
	}

}
