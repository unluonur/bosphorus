package org.bosphorus.expression.string;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class StrContains implements IExpression<Boolean> {
	
	private IExpression<String> text;
	private IExpression<String> searchString;

	@Override
	public Boolean execute(ITuple input) throws Exception {
		return text.execute(input).contains(searchString.execute(input));
	}

}
