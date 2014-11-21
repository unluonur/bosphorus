package org.bosphorus.stream.pipe;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class Projection<TInput> implements IPipe<TInput> {

	private List<IExpression<TInput, ?>> expressions;
	private IPipe<List<Object>> outputStream;
	
	public Projection(List<IExpression<TInput, ?>> expressions, IPipe<List<Object>> outputStream) {
		this.expressions = expressions;
		this.outputStream = outputStream;
	}
	
	private List<Object> convert(TInput input) throws Exception {
		ArrayList<Object> result = new ArrayList<Object>();
		for(IExpression<TInput, ?> expr: expressions) {
			result.add(expr.execute(input));
		}
		return result;
	}

	@Override
	public void writeOne(TInput input) throws Exception {
		outputStream.writeOne(convert(input));
	}

	@Override
	public void writeMulti(List<TInput> input) throws Exception {
		ArrayList<List<Object>> result = new ArrayList<List<Object>>();
		for(TInput item: input) {
			result.add(convert(item));
		}
		outputStream.writeMulti(result);
	}

}
