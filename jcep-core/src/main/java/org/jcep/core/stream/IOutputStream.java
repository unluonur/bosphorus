package org.jcep.core.stream;

public interface IOutputStream<TOutput> {
	
	void send(TOutput output);
	
}
