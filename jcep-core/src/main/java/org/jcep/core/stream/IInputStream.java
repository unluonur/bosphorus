package org.jcep.core.stream;

public interface IInputStream<TInput> {
	
	void execute(TInput input);
	
}
