package org.bosphorus.stream;

import java.util.List;

public interface IStreamReader<TOutput> {
	TOutput read() throws Exception;
	List<TOutput> readAll() throws Exception;
}
