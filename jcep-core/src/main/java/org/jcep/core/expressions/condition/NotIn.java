package org.jcep.core.expressions.condition;

import java.util.ArrayList;

import org.jcep.core.expressions.IExpression;

public class NotIn<TType extends Comparable<TType>, TContext> extends BaseListComparison<TType, TContext> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3888947395923766733L;
	
	public NotIn(IExpression<TType, TContext> value,
			ArrayList<IExpression<TType, TContext>> list) {
		super(value, list);
	}

	@Override
	public Boolean execute(TContext context) {
		TType value = this.getValue().execute(context);
		for(IExpression<TType, TContext> expr: this.getList()) {
			if(value.equals(expr.execute(context))) {
				return false;
			}
		}
		return true;
	}

}
