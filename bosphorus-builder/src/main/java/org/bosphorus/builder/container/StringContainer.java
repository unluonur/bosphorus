package org.bosphorus.builder.container;

import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.string.StrConcat;
import org.bosphorus.expression.string.StrLength;

public class StringContainer extends BaseComparableContainer<String> {

	public StringContainer(IExpression<String> expression) {
		super(expression);
	}
	
	public StringContainer append(StringContainer value) {
		return new StringContainer(new StrConcat(this.getExpression(), value.getExpression()));
	}
	
	public IntegerContainer length() {
		return new IntegerContainer(new StrLength(this.getExpression()));
	}

}
