package org.bosphorus.expression.batch;

public class CountLongExecutor implements IBatchExecutor<Object, Long> {
	private Long value;

	public CountLongExecutor() {
		this.reset();
	}

	@Override
	public void execute(Object input) throws Exception {
		if(input != null) {
			value++;
		}
	}

	@Override
	public Long getValue() {
		return value;
	}

	@Override
	public void reset() {
		this.value = 0L;
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
