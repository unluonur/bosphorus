package org.bosphorus.storm.stream;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.statement.IStatement;

import backtype.storm.task.OutputCollector;
import backtype.storm.tuple.Tuple;

public class StreamCollector implements IStatement<Tuple> {
	private String streamId;
	private List<IExpression<Tuple, Object>> streamDefinition;
	private OutputCollector collector;

	@Override
	public void execute(Tuple data) throws Exception {
		ArrayList<Object> values = new ArrayList<Object>();
		for(IExpression<Tuple, Object> expr: streamDefinition) {
			values.add(expr.execute(data));
		}
		collector.emit(streamId, data, values);
		collector.ack(data);
	}

}
