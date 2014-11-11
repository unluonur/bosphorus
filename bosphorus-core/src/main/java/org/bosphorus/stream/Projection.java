package org.bosphorus.stream;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class Projection<TInput> implements IStreamWriter<TInput> {

	private List<IExpression<TInput, ?>> expressions;
	private IStreamWriter<List<Object>> outputStream;
	
	public Projection(List<IExpression<TInput, ?>> expressions, IStreamWriter<List<Object>> outputStream) {
		this.expressions = expressions;
		this.outputStream = outputStream;
	}

	@Override
	public void writeOne(TInput input) throws Exception {
		ArrayList<Object> result = new ArrayList<Object>();
		for(IExpression<TInput, ?> expr: expressions) {
			result.add(expr.execute(input));
		}
		outputStream.writeOne(result);
	}

	@Override
	public void writeMulti(List<TInput> input) throws Exception {
		ArrayList<List<Object>> result = new ArrayList<List<Object>>();
		for(TInput data: input) {
			ArrayList<Object> tuple = new ArrayList<Object>();
			for(IExpression<TInput, ?> expr: expressions) {
				tuple.add(expr.execute(data));
			}
		}
		outputStream.writeMulti(result);
	}

}
