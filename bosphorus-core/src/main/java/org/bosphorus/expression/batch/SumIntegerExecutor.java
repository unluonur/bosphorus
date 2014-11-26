package org.bosphorus.expression.batch;

public class SumIntegerExecutor implements IBatchExecutor<Number, Integer> {
	private Integer sum;
	
	public SumIntegerExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.intValue();
	}

	@Override
	public Integer getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0;
	}

	@Override
	public Object getState() {
		return this.sum;
	}

	@Override
	public void setState(Object state) {
		this.sum = (Integer)state;
	}

}
