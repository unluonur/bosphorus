package org.bosphorus.expression.string;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class StrLength implements IExpression<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8792321758093603310L;
	
	private IExpression<String> value;
	
	public StrLength() {
	}
	
	public StrLength(IExpression<String> value) {
		this.setValue(value);
	}

	public IExpression<String> getValue() {
		return value;
	}

	public void setValue(IExpression<String> value) {
		this.value = value;
	}

	@Override
	public Integer execute(ITuple input) throws Exception {
		return this.getValue().execute(input).length();
	}

}
