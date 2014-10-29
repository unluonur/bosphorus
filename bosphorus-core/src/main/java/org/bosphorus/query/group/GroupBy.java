package org.bosphorus.query.group;

import java.util.List;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class GroupBy<TInput> implements IGroupBy {
	@SuppressWarnings("rawtypes")
	private List<IExpression> groups;

	@Override
	public void init() {
	}

	@Override
	public void group(ITuple input) {
		// TODO Auto-generated method stub
		
	}

}
