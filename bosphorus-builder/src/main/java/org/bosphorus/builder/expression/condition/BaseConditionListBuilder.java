package org.bosphorus.builder.expression.condition;

import java.util.List;

import org.bosphorus.builder.expression.IExpressionBuilder;
import org.bosphorus.expression.scalar.IScalarExecutor;

public abstract class BaseConditionListBuilder<TInput> implements IExpressionBuilder<TInput, Boolean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<IExpressionBuilder<TInput, Boolean>> expressions;

	public List<IExpressionBuilder<TInput, Boolean>> getExpressions() {
		return expressions;
	}

	public void setExpressions(List<IExpressionBuilder<TInput, Boolean>> expressions) {
		this.expressions = expressions;
	}

	@Override
	public String serialize() {
		if(this.getExpressions().size() == 1) {
			return this.getExpressions().get(0).serialize();
		}
		String result = "";
		for(IExpressionBuilder<TInput, Boolean> expression: this.getExpressions()) {
			if(result.length() > 0) {
				result += " " + this.getOperator() + " ";
			}
			result += expression.serialize();
		}
		return "(" + result + ")";
	}
	
	protected abstract String getOperator();

	@Override
	public IScalarExecutor<TInput, Boolean> build() {
		return this.build(0);
	}
	
	private IScalarExecutor<TInput, Boolean> build(Integer index) {
		if(index == this.getExpressions().size() - 1) {
			return this.getExpressions().get(index).build();
		}
		return this.build(this.getExpressions().get(index).build(), this.build(index + 1));
	}
	
	protected abstract IScalarExecutor<TInput, Boolean> build(IScalarExecutor<TInput, Boolean> left, IScalarExecutor<TInput, Boolean> right);

}
