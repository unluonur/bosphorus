package org.bosphorus.topology.node.builder;

import java.util.List;

import org.bosphorus.stream.IWriter;

public interface IWriteOnlyNodeBuilder<TInput> {
	List<IWriter<TInput>> build();
}
