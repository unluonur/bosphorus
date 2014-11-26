package org.bosphorus.expression.batch;

public class AvgFloatExecutor implements IBatchExecutor<Number, Float> {
	private Double sum;
	private Long count;

	public AvgFloatExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.doubleValue();
		this.count++;
	}

	@Override
	public Float getValue() {
		if(this.count != 0) {
			Double d = this.sum / this.count;
			return d.floatValue();
		}
		return null;
	}

	@Override
	public void reset() {
		sum = 0.0;
		count = 0L;
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
