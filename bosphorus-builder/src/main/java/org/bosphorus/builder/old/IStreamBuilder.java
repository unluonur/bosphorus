package org.bosphorus.builder.old;

import java.util.List;

import org.bosphorus.stream.IPipeExecutor;

public interface IStreamBuilder {
	IPipeExecutor<List<Object>> build(IPipeExecutor<List<Object>> output);
}
