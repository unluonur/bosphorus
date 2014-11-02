package org.bosphorus.expression;

public class IIf<TInput, TOutput> implements IExpression<TInput, TOutput> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1997499773697734754L;
	
	private IExpression<TInput, Boolean> condition;
	private IExpression<TInput, TOutput> trueValue;
	private IExpression<TInput, TOutput> falseValue;

	public IIf() {
		
	}
	
	public IIf(IExpression<TInput, Boolean> condition, IExpression<TInput, TOutput> trueValue, IExpression<TInput, TOutput> falseValue) {
		this.setCondition(condition);
		this.setTrueValue(trueValue);
		this.setFalseValue(falseValue);
	}

	public IExpression<TInput, Boolean> getCondition() {
		return condition;
	}

	public void setCondition(IExpression<TInput, Boolean> condition) {
		this.condition = condition;
	}

	public IExpression<TInput, TOutput> getTrueValue() {
		return trueValue;
	}

	public void setTrueValue(IExpression<TInput, TOutput> trueValue) {
		this.trueValue = trueValue;
	}

	public IExpression<TInput, TOutput> getFalseValue() {
		return falseValue;
	}

	public void setFalseValue(IExpression<TInput, TOutput> falseValue) {
		this.falseValue = falseValue;
	}

	@Override
	public TOutput execute(TInput input) throws Exception {
		return this.getCondition().execute(input) ? this.getTrueValue().execute(input) : this.getFalseValue().execute(input);
	}
	
}
