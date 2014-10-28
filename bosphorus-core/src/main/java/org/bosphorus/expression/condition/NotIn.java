package org.bosphorus.expression.condition;

import java.util.ArrayList;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class NotIn<TType extends Comparable<TType>> extends BaseListComparison<TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3888947395923766733L;
	
	public NotIn(IExpression<TType> value,
			ArrayList<IExpression<TType>> list) {
		super(value, list);
	}

	@Override
	public Boolean execute(ITuple input) throws Exception {
		return !this.getList().contains(this.getValue().execute(input));
	}

}
