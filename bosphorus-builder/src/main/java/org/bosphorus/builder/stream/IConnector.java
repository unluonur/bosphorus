package org.bosphorus.builder.stream;

import org.bosphorus.stream.IStreamReader;
import org.bosphorus.stream.IStreamWriter;

public interface IConnector<TInput> {
	
	void connect(IStreamReader<TInput> source, IStreamWriter<TInput> target);
	
}
