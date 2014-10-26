package org.jcep.storm.stream;

import java.util.ArrayList;
import java.util.List;

import org.jcep.core.expressions.IExpression;
import org.jcep.core.stream.ICollector;

import backtype.storm.task.OutputCollector;
import backtype.storm.tuple.Tuple;

public class BoltOutputStream implements ICollector<Tuple> {
	private String streamId;
	private List<IExpression<Tuple, Object>> streamDefinition;
	private OutputCollector collector;

	@Override
	public void collect(Tuple output) {
		ArrayList<Object> values = new ArrayList<Object>();
		for(IExpression<Tuple, Object> expr: streamDefinition) {
			values.add(expr.execute(output));
		}
		collector.emit(streamId, output, values);
		collector.ack(output);
	}

}
