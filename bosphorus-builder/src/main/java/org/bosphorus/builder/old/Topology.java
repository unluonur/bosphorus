package org.bosphorus.builder.old;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * Term Topology is borrowed from Storm
 */
public class Topology {
	private Map<String, Integer> namedStreams;
	private Map<Integer, INode> streams;
	private Map<Integer, List<Integer>> targets;
	private Map<Integer, List<Integer>> sources;
	private Integer identity = 0;
	
	public INode findStreamById(Integer id) {
		return this.streams.get(id);
	}
	
	private Integer resolveStreamByName(String name) {
		return this.namedStreams.get(name);
	}
	
	private Integer registerStream(String name, INode stream) throws Exception {
		if(this.namedStreams.containsKey(name)) {
			throw new Exception("Stream name "+name+" already in use");
		}
		Integer id = this.registerStream(stream);
		this.namedStreams.put(name, id);
		return id;
	}
	
	private Integer registerStream(INode stream) throws Exception {
		if(this.streams.containsKey(stream.hashCode())) {
			throw new Exception("Stream already registered");
		}
		Integer id = ++identity;
		this.streams.put(id, stream);
		this.targets.put(id, new ArrayList<Integer>());
		this.sources.put(id, new ArrayList<Integer>());
		return id;
	}
	
	private void bind(Integer sourceId, Integer targetId) throws Exception {
		if(!this.findStreamById(sourceId).getOutput().isMatch(this.findStreamById(targetId).getInput())) {
			throw new Exception("Fields mismatch");
		}

		this.targets.get(sourceId).add(targetId);
		this.sources.get(targetId).add(sourceId);
	}
	
	private List<Integer> getTargets(Integer streamId) {
		return this.targets.get(streamId);
	}
	
	private List<Integer> getSources(Integer streamId) {
		return this.sources.get(streamId);
	}

}
