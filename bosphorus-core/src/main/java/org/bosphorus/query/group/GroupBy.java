package org.bosphorus.query.group;

import java.util.List;

import org.bosphorus.expression.IExpression;

public class GroupBy<TInput> implements IGroupBy<TInput> {
	@SuppressWarnings("rawtypes")
	private List<IExpression> groups;

	@Override
	public void init() {
	}

	@Override
	public void group(TInput input) {
		// TODO Auto-generated method stub
		
	}

}
