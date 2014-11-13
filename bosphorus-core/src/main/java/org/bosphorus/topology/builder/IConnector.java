package org.bosphorus.topology.builder;

import org.bosphorus.pipe.IPipe;
import org.bosphorus.pipe.IReader;

public interface IConnector<TInput> {
	
	void connect(IReader<TInput> source, IPipe<TInput> target);
	
}
