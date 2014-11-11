package org.bosphorus.builder.stream;

import org.bosphorus.stream.IStreamWriter;

public interface IStreamBuilder<TInput, TOutput> {
	
	IStreamWriter<TInput> build(IStreamWriter<TOutput> output);
	
}
