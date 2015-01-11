package org.bosphorus.api.builder.expression.scalar.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.expression.scalar.executor.tuple.ListElementExecutor;

public class ListElementExpression<TInput extends List<?>, TOutput> implements IScalarExpression1<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer fieldIndex;
	
	public ListElementExpression(Integer fieldIndex) {
		this.setFieldIndex(fieldIndex);
	}

	public Integer getFieldIndex() {
		return fieldIndex;
	}

	public void setFieldIndex(Integer fieldIndex) {
		this.fieldIndex = fieldIndex;
	}

	@Override
	public IScalarExecutor1<TInput, TOutput> build() {
		return new ListElementExecutor<TInput, TOutput>(this.getFieldIndex());
	}

}
