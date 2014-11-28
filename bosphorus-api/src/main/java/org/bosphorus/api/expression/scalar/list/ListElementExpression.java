package org.bosphorus.api.expression.scalar.list;

import java.util.List;

import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.list.ListElement;

public class ListElementExpression<TInput extends List<?>, TOutput> implements IScalarExpression<TInput, TOutput> {

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
	public IScalarExecutor<TInput, TOutput> build() {
		return new ListElement<TInput, TOutput>(this.getFieldIndex());
	}

}
