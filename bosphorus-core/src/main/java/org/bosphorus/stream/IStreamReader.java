package org.bosphorus.stream;

import java.util.List;

public interface IStreamReader<TOutput> {
	List<TOutput> read() throws Exception;
}
