package org.bosphorus.pipe;

import java.util.List;

public interface IPipe<TInput> {
	
	void write(TInput input) throws Exception;
	
	void write(List<TInput> input) throws Exception;

}
