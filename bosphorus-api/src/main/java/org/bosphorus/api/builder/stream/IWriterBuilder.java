package org.bosphorus.api.builder.stream;

import java.io.Serializable;

import org.bosphorus.stream.IWriter;

public interface IWriterBuilder<TInput> extends Serializable {
	
	IWriter<TInput> build();
	
}
