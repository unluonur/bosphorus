package org.bosphorus.pipe;

import java.util.List;

public interface IReader<TOutput> {
	
	List<TOutput> read() throws Exception;
	
}
