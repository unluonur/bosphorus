package org.bosphorus.stream.pipe;

import java.util.List;

import org.bosphorus.stream.IPipeExecutor;

public class ConsoleLogExecutor<TInput> implements IPipeExecutor<TInput> {
	
	@Override
	public void writeOne(TInput input) throws Exception {
		System.out.println(input);
	}

	@Override
	public void writeMulti(List<? extends TInput> input) throws Exception {
		System.out.println(input);
	}

}
