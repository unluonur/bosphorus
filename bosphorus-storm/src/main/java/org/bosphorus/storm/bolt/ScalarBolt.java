package org.bosphorus.storm.bolt;

import java.util.List;
import java.util.Map;

import org.bosphorus.stream.IPipeExecutor;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;

public class ScalarBolt extends BaseRichBolt {
	private OutputCollector collector;
	private IPipeExecutor<? super List<? extends Object>> output;

	@Override
	public void prepare(Map stormConf, TopologyContext context,
			OutputCollector collector) {
		this.collector = collector;
	}

	@Override
	public void execute(Tuple input) {
		try {
			output.writeOne(input.getValues());
			collector.ack(input);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub
		
	}

}
