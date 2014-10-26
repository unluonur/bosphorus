package org.jcep.core.stream;

import java.util.List;

public class BatchStream<TType> implements IExecutor<TType> {
	
	private ICollector<List<TType>> collector;

	@Override
	public void execute(TType input) {
		// TODO Auto-generated method stub
		
	}

}
