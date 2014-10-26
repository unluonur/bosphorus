package org.jcep.core.expressions.condition;

import java.util.ArrayList;

import org.jcep.core.expressions.IExpression;

public class NotIn<TInput, TOutput extends Comparable<TOutput>> extends BaseListComparison<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3888947395923766733L;
	
	public NotIn(IExpression<TInput, TOutput> value,
			ArrayList<IExpression<TInput, TOutput>> list) {
		super(value, list);
	}

	@Override
	public Boolean execute(TInput input) {
		TOutput value = this.getValue().execute(input);
		for(IExpression<TInput, TOutput> expr: this.getList()) {
			if(value.equals(expr.execute(input))) {
				return false;
			}
		}
		return true;
	}

}
