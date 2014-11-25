package org.bosphorus.topology.builder;

import java.util.List;

import org.bosphorus.stream.batch.IReader;
import org.bosphorus.stream.pipe.IPipe;

public interface IConnector<TInput> {
	
	void connect(IReader<List<TInput>> source, IPipe<TInput> target);
	
}
