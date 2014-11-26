package org.bosphorus.expression.batch;

public class MinExecutor<TType extends Comparable<TType>> implements IBatchExecutor<TType, TType> {
	private TType value;
	
	public MinExecutor() {
		this.reset();
	}

	@Override
	public void execute(TType input) throws Exception {
		if(this.value == null || this.value.compareTo(input) > 0) {
			this.value = input;
		}
	}

	@Override
	public TType getValue() {
		return this.value;
	}

	@Override
	public void reset() {
		value = null;
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
