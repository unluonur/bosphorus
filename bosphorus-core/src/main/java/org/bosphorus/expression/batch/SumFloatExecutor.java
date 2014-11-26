package org.bosphorus.expression.batch;

public class SumFloatExecutor implements IBatchExecutor<Number, Float> {
	private Float sum;
	
	public SumFloatExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.floatValue();
	}

	@Override
	public Float getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0.0F;
	}

	@Override
	public Object getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(Object state) {
		// TODO Auto-generated method stub
		
	}

}
