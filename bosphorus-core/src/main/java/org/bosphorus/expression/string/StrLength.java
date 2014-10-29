package org.bosphorus.expression.string;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class StrLength<TInput> implements IExpression<TInput, Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8792321758093603310L;
	
	private IExpression<TInput, String> value;
	
	public StrLength() {
	}
	
	public StrLength(IExpression<TInput, String> value) {
		this.setValue(value);
	}

	public IExpression<TInput, String> getValue() {
		return value;
	}

	public void setValue(IExpression<TInput, String> value) {
		this.value = value;
	}

	@Override
	public Integer execute(TInput input) throws Exception {
		return this.getValue().execute(input).length();
	}

}
