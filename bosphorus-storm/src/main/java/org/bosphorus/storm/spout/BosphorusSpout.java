package org.bosphorus.storm.spout;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bosphorus.stream.IPipeExecutor;
import org.bosphorus.topology.old.node.old.IReadNode;
import org.bosphorus.topology.old.node.old.IStreamDefinition;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;

public class BosphorusSpout extends BaseRichSpout {
	private SpoutOutputCollector collector;
	private IReadNode<List<Object>> node;
	
	public BosphorusSpout(IReadNode<List<Object>> node) {
		this.node = node;
		List<IStreamDefinition> definition = this.node.defineOutput();
		ArrayList<IPipeExecutor<List<Object>>> outputs = new ArrayList<IPipeExecutor<List<Object>>>();
		outputs.add(new IPipeExecutor<List<Object>>() {
			
			@Override
			public void writeMulti(List<? extends List<Object>> input) throws Exception {
				for(List<Object> data: input) {
					this.writeOne(data);
				}
			}
			
			@Override
			public void writeOne(List<Object> input) throws Exception {
				collector.emit(input);
			}
		});
		
		for(Integer i=1; i<definition.size(); i++) {
			final String streamName = i.toString();

			outputs.add(new IPipeExecutor<List<Object>>() {
				
				@Override
				public void writeMulti(List<? extends List<Object>> input) throws Exception {
					for(List<Object> data: input) {
						this.writeOne(data);
					}
				}
				
				@Override
				public void writeOne(List<Object> input) throws Exception {
					collector.emit(streamName, input);
				}
			});
		}

	}

	@Override
	public void open(Map conf, TopologyContext context,
			SpoutOutputCollector collector) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nextTuple() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		List<IStreamDefinition> output = this.node.defineOutput();
		declarer.declare(new Fields(this.defineOutput(output.get(0))));
		for(Integer i=1; i<output.size(); i++) {
			declarer.declareStream(i.toString(), new Fields(this.defineOutput(output.get(i))));
		}
	}
	
	private List<String> defineOutput(IStreamDefinition definition) {
		ArrayList<String> result = new ArrayList<String>();
		for(Integer i=0; i<definition.getLength(); i++) {
			result.add(i.toString());
		}
		return result;
	}

}
