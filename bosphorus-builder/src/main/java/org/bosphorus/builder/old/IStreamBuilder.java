package org.bosphorus.builder.old;

import java.util.List;

import org.bosphorus.stream.IWriter;

public interface IStreamBuilder {
	IWriter<List<Object>> build(IWriter<List<Object>> output);
}
