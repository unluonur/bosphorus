package org.bosphorus.stream;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class Projection<TInput> implements IStreamWriter<TInput> {

	@SuppressWarnings("rawtypes")
	private List<IExpression> expressions;
	private IStreamWriter<List<Object>> outputStream;
	
	@SuppressWarnings("rawtypes")
	public Projection(List<IExpression> expressions, IStreamWriter<List<Object>> outputStream) {
		this.expressions = expressions;
		this.outputStream = outputStream;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void writeOne(TInput input) throws Exception {
		ArrayList<Object> result = new ArrayList<Object>();
		for(IExpression expr: expressions) {
			result.add(expr.execute(input));
		}
		outputStream.writeOne(result);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void writeMulti(List<TInput> input) throws Exception {
		ArrayList<List<Object>> result = new ArrayList<List<Object>>();
		for(TInput data: input) {
			ArrayList<Object> tuple = new ArrayList<Object>();
			for(IExpression expr: expressions) {
				tuple.add(expr.execute(data));
			}
		}
		outputStream.writeMulti(result);
	}

}
