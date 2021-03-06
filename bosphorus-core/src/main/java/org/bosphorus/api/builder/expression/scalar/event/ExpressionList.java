package org.bosphorus.api.builder.expression.scalar.event;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.core.expression.scalar.factory.event.ExpressionListExecutorFactory;

public class ExpressionList<TInput, TType> implements IScalarExpression1<TInput, List<TType>> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<? extends IScalarExpression1<? super TInput, ? extends TType>> expressions;
	
	public ExpressionList(List<? extends IScalarExpression1<? super TInput, ? extends TType>> expressions) {
		this.setExpressions(expressions);
	}
	
	@Override
	public IScalarExecutorFactory1<TInput, List<TType>> build() {
		ArrayList<IScalarExecutorFactory1<? super TInput, ? extends TType>> list = new ArrayList<IScalarExecutorFactory1<? super TInput, ? extends TType>>();
		for(IScalarExpression1<? super TInput, ? extends TType> expression: getExpressions()) {
			list.add(expression.build());
		}
		
		return new ExpressionListExecutorFactory<TInput, TType>(list);
	}

	public List<? extends IScalarExpression1<? super TInput, ? extends TType>> getExpressions() {
		return expressions;
	}

	public void setExpressions(List<? extends IScalarExpression1<? super TInput, ? extends TType>> expressions) {
		this.expressions = expressions;
	}

}
