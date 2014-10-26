package org.bosphorus.core.expressions.conditions;

import java.util.ArrayList;

import org.bosphorus.core.expressions.IExpression;

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
		TType value = this.getValue().execute(input);
		for(IExpression<TInput, TType> expr: this.getList()) {
			if(value.equals(expr.execute(input))) {
				return false;
			}
		}
		return true;
	}

}
