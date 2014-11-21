package org.bosphorus.stream.pipe;

import java.util.List;

public interface IPipe<TInput> {
	
	void writeOne(TInput input) throws Exception;
	
	void writeMulti(List<TInput> input) throws Exception;

}
