package org.bosphorus.topology.node.builder;

import java.util.List;
import org.bosphorus.stream.pipe.IPipe;

public interface IReadOnlyNodeBuilder<TOutput> {
	void build(List<IPipe<TOutput>> outputs);
}
