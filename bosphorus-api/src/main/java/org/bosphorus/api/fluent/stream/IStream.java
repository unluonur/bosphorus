package org.bosphorus.api.fluent.stream;

import org.bosphorus.api.fluent.expression.scalar.primitive.ObjectExpression;

public interface IStream<TType> {

	ObjectExpression<TType> field(String fieldName);
	
}
