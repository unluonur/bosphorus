package org.bosphorus.pipe;

import java.util.ArrayList;
import java.util.List;
import org.bosphorus.expression.IExpression;

public class Projection<TInput> extends BasePipe<TInput> {

	private List<IExpression<TInput, ?>> expressions;
	private IPipe<List<Object>> outputStream;
	
	public Projection(List<IExpression<TInput, ?>> expressions, IPipe<List<Object>> outputStream) {
		this.expressions = expressions;
		this.outputStream = outputStream;
	}

	@Override
	public void write(TInput input) throws Exception {
		ArrayList<Object> result = new ArrayList<Object>();
		for(IExpression<TInput, ?> expr: expressions) {
			result.add(expr.execute(input));
		}
		outputStream.write(result);
	}

}
