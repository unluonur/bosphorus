package org.bosphorus.expression.condition;

import java.util.ArrayList;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class In<TType extends Comparable<TType>> extends BaseListComparison<TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 326293447079841977L;

	public In(IExpression<TType> value,
			ArrayList<IExpression<TType>> list) {
		super(value, list);
	}

	@Override
	public Boolean execute(ITuple input) throws Exception {
		return this.getList().contains(this.getValue().execute(input));
	}

}
