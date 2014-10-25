package org.jcep.core.expressions.condition;

import java.util.ArrayList;

import org.jcep.core.expressions.common.IExpression;

public class In<TType extends Comparable<TType>, TContext> extends BaseListComparison<TType, TContext> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 326293447079841977L;

	public In(IExpression<TType, TContext> value,
			ArrayList<IExpression<TType, TContext>> list) {
		super(value, list);
	}

	@Override
	public Boolean execute(TContext context) {
		TType value = this.getValue().execute(context);
		for(IExpression<TType, TContext> expr: this.getList()) {
			if(value.equals(expr.execute(context))) {
				return true;
			}
		}
		return false;
	}

}
