package org.bosphorus.stream.batch;

import java.util.List;

public interface IReader<TOutput> {
	
	List<TOutput> read() throws Exception;
	
}
