package org.jcep.core.stream;

public interface ICollector<TType> {
	
	void collect(TType data);
	
}
