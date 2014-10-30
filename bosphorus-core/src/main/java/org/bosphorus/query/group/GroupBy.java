package org.bosphorus.query.group;

import java.util.List;

import org.bosphorus.expression.IExpression;

public class GroupBy<TInput> implements IGroupBy<TInput> {
	@SuppressWarnings("rawtypes")
	private List<IExpression> groups;

	@Override
	public void reset() {
	}

	@Override
	public void execute(TInput input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<List<Object>> getValues() {
		// TODO Auto-generated method stub
		return null;
	}

}
