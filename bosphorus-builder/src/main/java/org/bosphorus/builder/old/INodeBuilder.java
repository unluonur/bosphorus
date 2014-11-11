package org.bosphorus.builder.old;

import org.bosphorus.stream.IStreamWriter;

public interface INodeBuilder<TInput, TOutput> {
	IStreamWriter<TInput> build(IStreamWriter<TOutput> output);
}
