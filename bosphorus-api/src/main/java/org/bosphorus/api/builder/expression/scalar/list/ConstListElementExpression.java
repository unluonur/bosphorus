package org.bosphorus.api.builder.expression.scalar.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.expression.scalar.executor.tuple.ConstListElementExecutor;

public class ConstListElementExpression<TOutput> implements IScalarExpression1<List<? extends TOutput>, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer fieldIndex;
	
	public ConstListElementExpression(Integer fieldIndex) {
		this.setFieldIndex(fieldIndex);
	}

	public Integer getFieldIndex() {
		return fieldIndex;
	}

	public void setFieldIndex(Integer fieldIndex) {
		this.fieldIndex = fieldIndex;
	}

	@Override
	public IScalarExecutor1<List<? extends TOutput>, TOutput> build() {
		return new ConstListElementExecutor<TOutput>(this.getFieldIndex());
	}

}
