package org.bosphorus.stream.pipe;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.stream.IWriter;

public class IfElse<TInput> implements IWriter<TInput> {
	private IScalarExecutor<TInput, Boolean> condition;
	private IWriter<TInput> truePipe;
	private IWriter<TInput> falsePipe;

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
	public void writeMulti(List<? extends TInput> input) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
