package org.bosphorus.stream.batch;

public interface IReader<TOutput> {

	TOutput read() throws Exception;

}
