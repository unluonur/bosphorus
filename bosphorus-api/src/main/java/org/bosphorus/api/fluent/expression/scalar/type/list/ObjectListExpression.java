package org.bosphorus.api.fluent.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.builder.expression.scalar.common.ConvertExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.IntegerExpression;

public class ObjectListExpression<TInput> extends BaseListExpression<TInput, Object> {

	public ObjectListExpression(
			IScalarExpression<TInput, ? extends List<? extends Object>> builder) {
		super(builder);
	}
	
	public IntegerExpression<TInput> integerField(Integer fieldIndex) {
		return null;
//		return new IntegerExpression<TInput>(new ConvertExpression<TInput, Integer, Object>(this.))
	}

}
