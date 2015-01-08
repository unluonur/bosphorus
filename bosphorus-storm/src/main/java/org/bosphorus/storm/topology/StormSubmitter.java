package org.bosphorus.storm.topology;

import java.util.List;
import java.util.Map;

import org.bosphorus.topology.old.ITopology;
import org.bosphorus.topology.old.ITopologySubmitter;
import org.bosphorus.topology.old.node.old.IBaseNode;
import org.bosphorus.topology.old.node.old.IReadNode;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.IRichSpout;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.TopologyBuilder;

public class StormSubmitter implements ITopologySubmitter {

	@Override
	public void submit(ITopology topology) {
		
		TopologyBuilder builder = new TopologyBuilder();
		for(IBaseNode node: topology.getNodes()) {
			if(!(node instanceof IReadNode<?>)) {
			}
		}
	}
	
}
