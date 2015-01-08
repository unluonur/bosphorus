package org.bosphorus.api.builder.stream;

public interface IStream<TType> extends IStreamInput<TType> {
	
	void add(IStreamInput<TType> pipe);

}
