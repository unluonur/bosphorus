package org.bosphorus.expression;

public class IIf<TInput, TOutput> implements IExpression<TInput, TOutput> {
	
	private IExpression<TInput, Boolean> condition;
	private IExpression<TInput, TOutput> trueValue;
	private IExpression<TInput, TOutput> falseValue;
	
	public IIf(IExpression<TInput, Boolean> condition, IExpression<TInput, TOutput> trueValue, IExpression<TInput, TOutput> falseValue) {
		this.condition = condition;
		this.trueValue = trueValue;
		this.falseValue = falseValue;
	}

	@Override
	public TOutput execute(TInput input) throws Exception {
		return condition.execute(input) ? trueValue.execute(input) : falseValue.execute(input);
	}
	
}
