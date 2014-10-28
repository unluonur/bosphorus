package org.bosphorus.expression;

import org.bosphorus.stream.ITuple;

public class IIf<TOutput> implements IExpression<TOutput> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1997499773697734754L;
	
	private IExpression<Boolean> condition;
	private IExpression<TOutput> trueValue;
	private IExpression<TOutput> falseValue;

	public IIf() {
		
	}
	
	public IIf(IExpression<Boolean> condition, IExpression<TOutput> trueValue, IExpression<TOutput> falseValue) {
		this.setCondition(condition);
		this.setTrueValue(trueValue);
		this.setFalseValue(falseValue);
	}

	public IExpression<Boolean> getCondition() {
		return condition;
	}

	public void setCondition(IExpression<Boolean> condition) {
		this.condition = condition;
	}

	public IExpression<TOutput> getTrueValue() {
		return trueValue;
	}

	public void setTrueValue(IExpression<TOutput> trueValue) {
		this.trueValue = trueValue;
	}

	public IExpression<TOutput> getFalseValue() {
		return falseValue;
	}

	public void setFalseValue(IExpression<TOutput> falseValue) {
		this.falseValue = falseValue;
	}

	@Override
	public TOutput execute(ITuple input) throws Exception {
		return this.getCondition().execute(input) ? this.getTrueValue().execute(input) : this.getFalseValue().execute(input);
	}
	
}
