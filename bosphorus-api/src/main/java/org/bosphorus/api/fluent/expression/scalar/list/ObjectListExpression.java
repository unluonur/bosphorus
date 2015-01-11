package org.bosphorus.api.fluent.expression.scalar.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.fluent.expression.scalar.primitive.IntegerExpression;

public class ObjectListExpression<TInput> extends BaseListExpression<TInput, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ObjectListExpression(
			IScalarExpression1<TInput, ? extends List<? extends Object>> builder) {
		super(builder);
	}
	
	public IntegerExpression<TInput> integerField(Integer fieldIndex) {
		return null;
//		return new IntegerExpression<TInput>(new ConvertExpression<TInput, Integer, Object>(this.))
	}

}
