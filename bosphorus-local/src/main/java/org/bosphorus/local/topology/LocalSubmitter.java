package org.bosphorus.local.topology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bosphorus.stream.IWriter;
import org.bosphorus.topology.INodeBinding;
import org.bosphorus.topology.ITopology;
import org.bosphorus.topology.ITopologySubmitter;
import org.bosphorus.topology.node.old.IReadNode;
import org.bosphorus.topology.node.old.IWriteNode;

public class LocalSubmitter implements ITopologySubmitter {

	@Override
	public void submit(ITopology topology) {
		HashMap<String, List<List<INodeBinding<?>>>> map = new HashMap<String, List<List<INodeBinding<?>>>>();
		
		for(INodeBinding<?> binding: topology.getBindings()) {
			IReadNode<?> source = binding.getSourceNode();
			//IWriteNode<?> target = binding.getTargetNode();
			if(!map.containsKey(source.getId())) {
				map.put(source.getId(), new ArrayList<List<INodeBinding<?>>>());
				for(Integer i=0; i<source.defineOutput().size(); i++) {
					map.get(source.getId()).add(new ArrayList<INodeBinding<?>>());
				}
			}
			map.get(source.getId()).get(binding.getSourceIndex()).add(binding);
		}
		for(String key: map.keySet()) {
			IReadNode<?> source = topology.getOutputNode(key);
			ArrayList<IWriter<?>> inputs = new ArrayList<IWriter<?>>();
			for(List<INodeBinding<?>> bindings: map.get(key)) {
				//bindings.get(0).getSourceNode().
				//inputs.add(binding.getSourceNode().s)
			}
		}
	}
}
