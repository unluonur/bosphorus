package org.bosphorus.builder.old;

import java.util.List;

import org.bosphorus.stream.IStreamWriter;

public interface IStreamBuilder {
	IStreamWriter<List<Object>> build(IStreamWriter<List<Object>> output);
}
