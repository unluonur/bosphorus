package org.bosphorus.api.builder.expression.scalar.list;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.list.ExpressionListExecutor;

public class ExpressionList<TInput, TType> implements IScalarExpression<TInput, List<TType>> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<? extends IScalarExpression<? super TInput, ? extends TType>> expressions;
	
	public ExpressionList(List<? extends IScalarExpression<? super TInput, ? extends TType>> expressions) {
		this.setExpressions(expressions);
	}
	
	@Override
	public IScalarExecutor<TInput, List<TType>> build() {
		ArrayList<IScalarExecutor<? super TInput, ? extends TType>> list = new ArrayList<IScalarExecutor<? super TInput, ? extends TType>>();
		for(IScalarExpression<? super TInput, ? extends TType> expression: getExpressions()) {
			list.add(expression.build());
		}
		
		return new ExpressionListExecutor<TInput, TType>(list);
	}

	public List<? extends IScalarExpression<? super TInput, ? extends TType>> getExpressions() {
		return expressions;
	}

	public void setExpressions(List<? extends IScalarExpression<? super TInput, ? extends TType>> expressions) {
		this.expressions = expressions;
	}

}
