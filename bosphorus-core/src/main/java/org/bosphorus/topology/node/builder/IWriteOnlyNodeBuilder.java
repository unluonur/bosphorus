package org.bosphorus.topology.node.builder;

import java.util.List;

import org.bosphorus.stream.pipe.IPipe;

public interface IWriteOnlyNodeBuilder<TInput> {
	List<IPipe<TInput>> build();
}
