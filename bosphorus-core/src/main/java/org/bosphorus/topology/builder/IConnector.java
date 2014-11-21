package org.bosphorus.topology.builder;

import org.bosphorus.stream.batch.IReader;
import org.bosphorus.stream.pipe.IPipe;

public interface IConnector<TInput> {
	
	void connect(IReader<TInput> source, IPipe<TInput> target);
	
}
