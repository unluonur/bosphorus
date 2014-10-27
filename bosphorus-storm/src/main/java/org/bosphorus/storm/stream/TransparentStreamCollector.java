package org.bosphorus.storm.stream;

import org.bosphorus.statement.IStatement;

import backtype.storm.task.OutputCollector;
import backtype.storm.tuple.Tuple;

public class TransparentStreamCollector implements IStatement<Tuple> {
	private String streamId;
	private OutputCollector collector;

	@Override
	public void execute(Tuple data) {
		collector.emit(streamId, data, data.getValues());
		collector.ack(data);
	}
}
