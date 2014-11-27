package org.bosphorus.stream.pipe;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class IfElse<TInput> implements IPipe<TInput> {
	private IScalarExecutor<TInput, Boolean> condition;
	private IPipe<TInput> truePipe;
	private IPipe<TInput> falsePipe;

	@Override
	public void writeOne(TInput input) throws Exception {
		if(condition.execute(input)) {
			truePipe.writeOne(input);
		}
		else if(falsePipe != null) {
			falsePipe.writeOne(input);
		}
	}

	@Override
	public void writeMulti(List<TInput> input) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
