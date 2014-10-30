package org.bosphorus.query.projection;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class JoinTupleProjection implements IProjection<List<List<Object>>> {
	
	@SuppressWarnings("rawtypes")
	private List<IExpression> expressions;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Object> execute(List<List<Object>> values) throws Exception {
		ArrayList<Object> result = new ArrayList<Object>();
		for(IExpression expr: expressions) {
			result.add(expr.execute(values));
		}
		return result;
	}

}
