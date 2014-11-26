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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(Object state) {
		// TODO Auto-generated method stub
		
	}

}
