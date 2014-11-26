package org.bosphorus.expression.batch;

public class SumLongExecutor implements IBatchExecutor<Number, Long> {
	private Long sum;
	
	public SumLongExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.longValue();
	}

	@Override
	public Long getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0L;
	}

	@Override
	public Object getState() {
		return this.sum;
	}

	@Override
	public void setState(Object state) {
		this.sum = (Long)state;
	}

}
