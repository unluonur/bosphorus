package org.jcep.core.expressions.common;

public class IIf<TType, TContext> implements IExpression<TType, TContext> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1997499773697734754L;
	
	private IExpression<Boolean, TContext> condition;
	private IExpression<TType, TContext> trueValue;
	private IExpression<TType, TContext> falseValue;

	public IIf() {
		
	}
	
	public IIf(IExpression<Boolean, TContext> condition, IExpression<TType, TContext> trueValue, IExpression<TType, TContext> falseValue) {
		this.setCondition(condition);
		this.setTrueValue(trueValue);
		this.setFalseValue(falseValue);
	}

	public IExpression<Boolean, TContext> getCondition() {
		return condition;
	}

	public void setCondition(IExpression<Boolean, TContext> condition) {
		this.condition = condition;
	}

	public IExpression<TType, TContext> getTrueValue() {
		return trueValue;
	}

	public void setTrueValue(IExpression<TType, TContext> trueValue) {
		this.trueValue = trueValue;
	}

	public IExpression<TType, TContext> getFalseValue() {
		return falseValue;
	}

	public void setFalseValue(IExpression<TType, TContext> falseValue) {
		this.falseValue = falseValue;
	}

	@Override
	public TType execute(TContext context) {
		return this.getCondition().execute(context) ? this.getTrueValue().execute(context) : this.getFalseValue().execute(context);
	}
	
}
