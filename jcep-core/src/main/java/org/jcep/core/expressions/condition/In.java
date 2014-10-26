package org.jcep.core.expressions.condition;

import java.util.ArrayList;

import org.jcep.core.expressions.IExpression;

public class In<TInput, TType extends Comparable<TType>> extends BaseListComparison<TInput, TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 326293447079841977L;

	public In(IExpression<TInput, TType> value,
			ArrayList<IExpression<TInput, TType>> list) {
		super(value, list);
	}

	@Override
	public Boolean execute(TInput input) {
		TType value = this.getValue().execute(input);
		for(IExpression<TInput, TType> expr: this.getList()) {
			if(value.equals(expr.execute(input))) {
				return true;
			}
		}
		return false;
	}

}
