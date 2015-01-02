package org.bosphorus.api.builder.expression.scalar.date;

import java.util.Date;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.date.TruncateToWeekExecutor;

public class TruncateToWeekExpression<TInput> implements IScalarExpression<TInput, Date> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<? super TInput, Date> expression;
	
	public TruncateToWeekExpression(IScalarExpression<? super TInput, Date> expression) {
		this.setExpression(expression);
	}

	public IScalarExpression<? super TInput, Date> getExpression() {
		return expression;
	}

	public void setExpression(IScalarExpression<? super TInput, Date> expression) {
		this.expression = expression;
	}
	
	@Override
	public IScalarExecutor<TInput, Date> build() {
		return new TruncateToWeekExecutor<TInput>(getExpression().build());
	}

}
