package org.bosphorus.builder.old;

import org.bosphorus.stream.IWriter;

public interface INodeBuilder<TInput, TOutput> {
	IWriter<TInput> build(IWriter<TOutput> output);
}
