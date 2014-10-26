package org.jcep.core.stream;

public interface IExecutor<TType> {
	
	void execute(TType data);
	
}
