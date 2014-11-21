package org.bosphorus.storm.topology;

import java.util.List;
import java.util.Map;

import org.bosphorus.topology.ITopology;
import org.bosphorus.topology.ITopologySubmitter;
import org.bosphorus.topology.node.IBaseNode;
import org.bosphorus.topology.node.IReadNode;

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
