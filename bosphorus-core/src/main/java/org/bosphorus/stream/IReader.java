package org.bosphorus.stream;

public interface IReader<TOutput> {

	TOutput read() throws Exception;

}
