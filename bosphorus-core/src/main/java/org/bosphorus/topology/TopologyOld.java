/**
 * Copyright (c) Onur �nl�
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The latest version of this file can be found at https://github.com/unluonur/bosphorus
 */

package org.bosphorus.topology;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bosphorus.topology.node.old.IBaseNode;

/*
 * Term Topology is borrowed from Storm
 */
public class TopologyOld {

	private Map<String, Integer> namedNodes;
	private Map<Integer, IBaseNode> nodes;
	private Map<Integer, List<Integer>> targets;
	private Map<Integer, List<Integer>> sources;
	private Integer identity = 0;
	
	public IBaseNode findNodeById(Integer id) {
		return this.nodes.get(id);
	}
	
	private Integer resolveNodeByName(String name) {
		return this.namedNodes.get(name);
	}
	
	private Integer registerNode(String name, IBaseNode stream) throws Exception {
		if(this.namedNodes.containsKey(name)) {
			throw new Exception("Stream name "+name+" already in use");
		}
		Integer id = this.registerStream(stream);
		this.namedNodes.put(name, id);
		return id;
	}
	
	private Integer registerStream(IBaseNode stream) throws Exception {
		if(this.nodes.containsKey(stream.hashCode())) {
			throw new Exception("Stream already registered");
		}
		Integer id = ++identity;
		this.nodes.put(id, stream);
		this.targets.put(id, new ArrayList<Integer>());
		this.sources.put(id, new ArrayList<Integer>());
		return id;
	}
	
	private void bind(Integer sourceId, Integer targetId) throws Exception {
		/*
		if(!this.findNodeById(sourceId).getOutput().isMatch(this.findNodeById(targetId).getInput())) {
			throw new Exception("Fields mismatch");
		}
		*/

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
