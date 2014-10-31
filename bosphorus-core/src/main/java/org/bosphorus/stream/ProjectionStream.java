package org.bosphorus.stream;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class ProjectionStream<TOutput> implements IStreamWriter<TOutput> {

	@SuppressWarnings("rawtypes")
	private List<IExpression> expressions;
	private IStreamWriter<List<Object>> outputStream;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void writeSingle(TOutput input) throws Exception {
		ArrayList<Object> result = new ArrayList<Object>();
		for(IExpression expr: expressions) {
			result.add(expr.execute(input));
		}
		outputStream.writeSingle(result);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void writeMulti(List<TOutput> input) throws Exception {
		ArrayList<List<Object>> result = new ArrayList<List<Object>>();
		for(TOutput data: input) {
			ArrayList<Object> tuple = new ArrayList<Object>();
			for(IExpression expr: expressions) {
				tuple.add(expr.execute(data));
			}	
		}
		outputStream.writeMulti(result);
	}

}
