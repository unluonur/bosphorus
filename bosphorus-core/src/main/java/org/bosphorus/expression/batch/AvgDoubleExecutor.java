package org.bosphorus.expression.batch;

public class AvgDoubleExecutor implements IBatchExecutor<Number, Double> {
	private Double sum;
	private Long count;
	
	public AvgDoubleExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.doubleValue();
		count++;
	}

	@Override
	public Double getValue() {
		if(this.count != 0) {
			return this.sum / this.count;	
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
