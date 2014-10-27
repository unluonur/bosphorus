package org.bosphorus.expression.condition;

import java.util.ArrayList;

import org.bosphorus.expression.IExpression;

public class NotIn<TInput, TType extends Comparable<TType>> extends BaseListComparison<TInput, TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3888947395923766733L;
	
	public NotIn(IExpression<TInput, TType> value,
			ArrayList<IExpression<TInput, TType>> list) {
		super(value, list);
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return !this.getList().contains(this.getValue().execute(input));
	}

}