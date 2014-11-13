package org.bosphorus.builder.old;

import java.util.List;

import org.bosphorus.pipe.IPipe;

public interface IStreamBuilder {
	IPipe<List<Object>> build(IPipe<List<Object>> output);
}
