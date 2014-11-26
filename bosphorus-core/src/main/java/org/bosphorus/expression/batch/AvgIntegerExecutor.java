package org.bosphorus.expression.batch;

public class AvgIntegerExecutor implements IBatchExecutor<Number, Integer> {
	private Long sum;
	private Integer count;

	public AvgIntegerExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.intValue();
		this.count++;
	}

	@Override
	public Integer getValue() {
		if(this.count != 0) {
			Long l = this.sum / this.count;
			return l.intValue();	
		}
		return null;
	}

	@Override
	public void reset() {
		sum = 0L;
		count = 0;
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
